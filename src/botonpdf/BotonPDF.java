package botonpdf;

/**
@author Daniel y su intimo amigo Luis
 */
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Div;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class BotonPDF extends JButton{

    ImageIcon logoPDF = new ImageIcon(getClass().getResource("/imagenes/archivo-pdf.png"));  //-----------------------SET

    String nombre = "(Nombre Completo del Usuario)";
    String tipoM = "(Coloque el tipo de membresia)";
    String precio = "(Precio)";
    //-----------------------------------------------------------------------------------------------------

    LocalDateTime fechaActual = LocalDateTime.now();
    LocalDateTime horaMenos = fechaActual.minusHours(1);

    DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
    DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String fechaFinal = hora.format(horaMenos) + " con la fecha de " + fecha.format(fechaActual);
    //------------------------------------------------------------------------------------------------

    Paragraph titulo = new Paragraph("Asunto: Acuse de Registro");

    Paragraph texto1 = new Paragraph()
            .add("Por medio del presente documento se hace constancia que el usuario ")
            .add(nombre)
            .add(" se ha registrado correctamente a las ")
            .add(fechaFinal)
            .add(" con la ")
            .add(tipoM)
            .add(" con el precio de ")
            .add(precio)
            .setTextAlignment(TextAlignment.JUSTIFIED);

    Paragraph despedida = new Paragraph("¡Disfrutalo!");

    String nombrePDF = "Registro.pdf";

    Image logoE = new Image(ImageDataFactory.create(getClass().getResource("/imagenes/logo3.jpg")));  
    
    public BotonPDF() {
    
      this.setIcon(logoPDF);
        this.setBorderPainted(false);
        this.setBounds(540, 480, 230, 50);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setFocusPainted(false);
        this.setText("Crear PDF");

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    crearPDF();
                } catch (FileNotFoundException | MalformedURLException ex) {
                } catch (IOException ex) {
                }
            }
        });  
    
    }

    public void setNombrePDF(String nombre){
        if (nombre.endsWith(".pdf")) {
            nombrePDF = nombre;
        } else {
            // Mostrar mensaje de advertencia
            JOptionPane.showMessageDialog(null, "Hay un error en el metodo setNombrePDF.\n\n El nombre del archivo debe terminar con '.pdf'");
        }
    }
    
    public void setNombreEnParrafo(String nombre) {
        this.nombre = nombre;
        // Actualizar el texto1 con el nuevo nombre
        
        texto1 = new Paragraph()
                .add("Por medio del presente documento se hace constancia que el usuario ")
                .add(nombre)
                .add(" se ha registrado correctamente a las ")
                .add(fechaFinal)
                .add(" con la ")
                .add(tipoM)
                .add(" con el precio de ")
                .add(precio)
                .setTextAlignment(TextAlignment.JUSTIFIED);
    }
    public void setTipoEnParrafo(String tipoM) {
        this.tipoM = tipoM;
        // Actualizar el texto1 con el nuevo tipo de membresía
        texto1 = new Paragraph()
                .add("Por medio del presente documento se hace constancia que el usuario ")
                .add(nombre)
                .add(" se ha registrado correctamente a las ")
                .add(fechaFinal)
                .add(" con la ")
                .add(tipoM)
                .add(" con el precio de ")
                .add(precio)
                .setTextAlignment(TextAlignment.JUSTIFIED);
    }
    public void setPrecioEnParrafo(String precio) {
        this.precio = precio;
        // Actualizar el texto1 con el nuevo precio
        texto1 = new Paragraph()
                .add("Por medio del presente documento se hace constancia que el usuario ")
                .add(nombre)
                .add(" se ha registrado correctamente a las ")
                .add(fechaFinal)
                .add(" con la ")
                .add(tipoM)
                .add(" con el precio de ")
                .add(precio)
                .setTextAlignment(TextAlignment.JUSTIFIED);
    }
    
    public void crearPDF() throws FileNotFoundException, MalformedURLException, IOException {
     try {
 
        logoE.scaleToFit(250, 250);
        
        try (FileOutputStream fos = new FileOutputStream(nombrePDF);
            PdfWriter writer = new PdfWriter(fos);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf, PageSize.A5)) 
        {
        

            float x = (pdf.getDefaultPageSize().getWidth() - logoE.getImageScaledWidth()) / 2;
            float y = pdf.getDefaultPageSize().getHeight() - logoE.getImageScaledHeight() - 50;

            logoE.setFixedPosition(x, y);
            

            document.add(logoE);
            document.add(new Paragraph("\n"));
            
            Div espacioDiv = new Div().setHeight(280); 
            document.add(espacioDiv);
    
            PdfFont f1 = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);
            PdfFont f2 = PdfFontFactory.createFont(StandardFonts.HELVETICA);
            
            titulo.setFont(f1);
            texto1.setFont(f2);
            
            document.add(titulo);
            document.add(texto1);
            
            Div espacioDiv2 = new Div().setHeight(20);
            document.add(espacioDiv2);
            
            despedida.setFont(f1);
            document.add(despedida);
            
            document.close();
            
        }
           
        
        
    } catch (FileNotFoundException e) {
        System.out.println("Error al crear el archivo PDF: " + e.getMessage());
    }
     
    
    pregunta();
    
}
    
    
    private void pregunta() {
    
        int res = JOptionPane.showConfirmDialog(this, 
            "Se creo el Registro en pdf, en la carpeta del proyecto.\n\n¿Desea ver el archivo?",
            "Confirmación",
            JOptionPane.YES_NO_OPTION);
        
        if(res == JOptionPane.YES_OPTION){
            
            File fl = new File(nombrePDF);// cargar el documento PDF
            try {
                Desktop.getDesktop().open(fl);// abrir el documento con el programa por defecto para el tipo archivo PDF
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                    "Error al tratar de abrir el archivo 'Registro de " + nombre + ".pdf'");
            }
        }
     
}

    public void setTitulo(Paragraph titulo) {
        this.titulo = titulo;
    }

    public void setTexto1(Paragraph texto1) {
        this.texto1 = texto1;
    }

    public void setDespedida(Paragraph despedida) {
        this.despedida = despedida;
    }
    public void setLogo(Image logoE) {
        this.logoE = logoE;
    } 
    //------------------------------------------------------------------------------------------------

    public void setLogoPDF(ImageIcon logoPDF) {
        this.logoPDF = logoPDF;
    }
    public String getFechaFinal() {
        return fechaFinal;
    }

    
}
