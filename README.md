# BotonPDF

## Descripción

El `BotonPDF` es un componente Java que permite generar documentos PDF con información sobre el registro de usuarios. Este componente está diseñado para ser utilizado en aplicaciones Java Swing y proporciona una forma sencilla de crear documentos PDF con datos específicos del usuario.

Viene con una plantilla predeterminada que puede reutilizarse o modificarse por completo; desde el logo empleado hasta el mensaje de despedida, todo esto según los requerimientos de uso del componente.

## Requisitos

- Java Development Kit (JDK) 8 o superior.
- Biblioteca iTextPDF para manipulación de archivos PDF.
- IDE compatible con Java, preferiblemente IDE's como NetBeans o Eclipse para poder visualizar mejor el componente.

## Funcionalidades

- Generación de archivos PDF con información sobre el registro de usuarios.
- Personalización del nombre del archivo PDF generado.
- Inclusión de datos como nombre del usuario, tipo de membresía, precio y fecha de registro en el documento PDF, bajo una plantilla creada por defecto en el componente (Esta se muestra más adelante).
- Presentación de un mensaje de confirmación después de generar el PDF, dando la opción al usuario de abrir el archivo generado.
- Si bien no entra dentro del contexto del componente `BotonPDF`, podemos obtener la hora y fecha del día de hoy con el formato de `HH:mm:ss` y `dd/MM/yyyy`.

# API

## Clase BotonPDF

En la clase **BotonPDF**, se establece el proceso para crear un archivo PDF, con el nombre predeterminado de "Registro.pdf", donde por sí solo y gracias al evento `ActionPerformed`, se crea por defecto lo siguiente: 

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/58f224a9-b757-499e-b9b8-7ca11ff01bbc)

Como se ve ejemplificado en la imagen, este ya viene con los campos para modificarse para utilizar la plantilla ya creada. 

## Métodos de la clase

| Método                     | Descripción                                                                                                     |
|----------------------------|-----------------------------------------------------------------------------------------------------------------|
| `setNombrePDF(String nombre)`      | Establece el nombre del archivo PDF. Verifica si el nombre termina con ".pdf" y lo asigna a `nombrePDF`. Si no, muestra un mensaje de advertencia, en el cual se notifica que debe modificarse el `nombre` para que termine en **.pdf**.  |
| `setNombreEnParrafo(String nombre)`| Actualiza el nombre del usuario en el párrafo `texto1` del PDF.|
| `setTipoEnParrafo(String tipoM)`   | Actualiza el tipo de membresía en el párrafo `texto1` del PDF. |
| `setPrecioEnParrafo(String precio)`| Actualiza el precio en el párrafo `texto1` del PDF.            |
| `crearPDF()`                        | Crea un archivo PDF con la información actualizada, con un tamaño de hoja **A5** y con el párrafo de plantilla **justificado** y con la fuente `Helvetica`. Incluye el logotipo que, no importando su tamaño, se ajusta para que sea de dimensiones de 250 x 250, la información del usuario y muestra un diálogo para confirmar su visualización.|
| `pregunta()`                        | Muestra un diálogo para confirmar si se desea ver el archivo PDF creado. Si se escoge la opción de sí, abre el PDF creado en ese instante. |
| `setTitulo(Paragraph titulo)`       | Establece el título del documento PDF.                                                                        |
| `setTexto1(Paragraph texto1)`       | Establece el texto principal del documento PDF.  **Modificando todo el párrafo por defecto**, este método te da la opción de crear tu propio párrafo según tus requerimientos|
| `setDespedida(Paragraph despedida)` | Establece el mensaje de despedida del documento PDF.                                                          |
| `setLogo(Image logoE)`              | Establece el logotipo del documento PDF.                                                                      |
| `setLogoPDF(ImageIcon logoPDF)`     | Establece el logotipo del botón de creación del PDF.                                                          |
| `getFechaFinal()`                   | Retorna la fecha final del registro.  |                                                                         

**NOTA: Al ocupar los métodos `setNombreEnParrafo`, `setTipoEnParrafo`, `setPrecioEnParrafo` se entiende que se ocupará el párrafo predeterminado que viene con la clase `BotonPDF`, por lo que el método `setTexto1` no podrá usuarse.**   

# Instalación

Primeramente debemos tener las librerías de iText 
Las puedes conseguir desde su pagina oficial 

[https://itextpdf.com/resources/downloads](https://itextpdf.com/resources/downloads)


O bien las subimos directamente a drive 

[https://drive.google.com/drive/folders/1Imj8vPFbij6UEzG1KQ3QfLkV_RTGZ-3_](https://drive.google.com/drive/folders/1Imj8vPFbij6UEzG1KQ3QfLkV_RTGZ-3_)

#### Descarga desde drive
![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/1ec1ccdd-b769-4f5f-bce7-5e26a90de4a0) 
![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/0f0dacf6-def4-4d77-9d42-7f50f1abdb25)


Una vez descargados, tendremos que descomprimir el archivo Zip, le creara un archivo con todas las librerías ocupadas en este proyecto

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/fe80c019-df5a-4251-864a-5236970dad03)
![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/d8003aab-0d89-4188-8f15-d5a6cdbe4ab8)

Para la parte del Componente del BotonPDF, tenemos que ir a nuestro repositorio y descargar el archivo Zip.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/64b59143-90ea-4716-b25b-60d63e2ad261)

Una vez descargado tendremos que descomprimir el archivo, quedando de la siguiente manera.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/3cb34272-8583-4455-b761-2ef44f392d3e)
![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/4aeebaa9-ed6e-46e2-834c-008cb25206bc)

Para después pasar a la parte de abrir el proyecto en Netbeans.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/1de2729e-3155-4370-a6fd-97dc05fbb197)

Recordemos que el proyecto en nuestro caso fue descomprimido en nuestro escritorio

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/bfffe4df-a1c5-4efa-b6de-d692eb01f0d6)

Al momento de darle abrir al proyecto se nos presentan errores. Estos suelen ocurrir muy a menudo se trata del error en las librerías iText así como de la versión de java, por tanto mostraremos como solucionarlo.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/332c2b1c-eeff-45d8-9156-3ab9b46d06e8)

Para ello haremos lo siguiente: Daremos clic derecho sobre el proyecto y nos dirigiremos al apartado de resolver problemas del proyecto “Resolve Project Problems”.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/43f59710-1b7d-4c0a-84c8-8b607e0ecbbc)

Daremos clic y nos mostrara el siguiente recuadro de errores.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/e0425a7d-d187-4240-a415-0127d41b99c4)

Solucionaremos el problema de la versión invalida, la cual es la última. Daremos clic sobre el y después en Resolve

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/f6e75d06-36e2-4bbf-bb61-0bb7a0a8ba87)

Nos mostrara esta ventana y daremos clic en la segunda opción para así solucionar el error de compatibilidad 

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/899b6195-a87e-464e-82b6-bd828752a697)

Para los siguientes errores las cuales son de las librerías, volveremos a la parte del proyecto y daremos clic derecho sobre él, dirigiéndonos al punto de “Properties”

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/9fea1309-9f5b-43a6-bf78-ee495a8afc5f)

Y posteriormente lanzarnos esta ventana

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/0d170d6e-33b3-41a0-b994-9235ccc6f836)

Donde en el apartado de la izquierda nos dirigiremos a “Libraries”, en este apartado se nos muestran las librerías que no han sido detectadas de manera correcta.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/41d3e1b3-69dc-41ee-9ec1-46464b167326)

Para después borrar manualmente cada una de ellas. Para quedarnos de la siguiente manera:

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/1083c138-51cb-43a2-a3c5-f20c77ada6ef)

Una vez removidas, vamos a añadir las librerías correctas, en este caso son las que descargamos del drive anteriormente mostrado o las librerías del repositorio original de iText; en este caso ocuparemos las mostradas en el drive.
Daremos clic sobre el botón de “+” y escogeremos la opción de Jar/Folder

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/cbb1971d-06a8-476b-8a30-24a82fd97ae4)

Para finalmente mostrarnos las rutas de nuestros computadores y sus distintas carpetas, pero en este caso buscaremos las librerías de iText que hemos descargado previamente, recordando que estas fueron extraídas en el escritorio. 

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/18123d8f-d25b-4bec-bef3-79db44889a8e)

Una vez estando en el escritorio o dependiendo de la ruta donde se haya extraído este mismo, buscaremos dentro del archivo las librerías iText. Mostrando el siguiente menú:

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/148e3848-d5ab-4fa7-ad6b-add3144b0f0f)

Tendremos que añadir todos los jar que se encuentran en dicho archivo.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/92e1445d-3087-488f-8f20-c26393b6f800)

Una vez añadidos, se debe mostrar de la siguiente manera

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/a840aa33-fa40-400c-84cd-3834a080554a)

Una vez agregadas los errores del proyecto deben desaparecer.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/2ceae29f-dd1a-4b81-a1a1-27e31cc540b7)

Ya se puede Limpiar este mismo proyecto, para así crear el componente arrastrable.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/29cecd42-03ff-41df-acd5-78aa1393c1a8)

Para añadirlo a la paleta de botones se hace lo siguiente:
Dentro de la paleta de botones daremos clic derecho para así mostrarnos este recuadro, dando clic en esta última opción.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/7608f7a5-19f6-4b18-ab88-84b5da3c7316)

Nos mostrara la siguiente ventana:
Daremos clic en “Add from Jar”

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/aa1c050d-7ad3-48ca-8f19-59b3004a1ba9)

Mostrándonos después esta ventana:
Buscaremos el proyecto dentro de nuestro computador, según haya sido almacenada, para nuestro caso fue en el escritorio.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/173b5ce8-4318-4c8a-9ec7-3a267d9dc528)

Una vez encontrado el proyecto, lo abriremos y nos encontraremos con estos archivos, abriremos la carpeta “dist”

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/b28a707d-ca13-48c2-8e4c-9e2080e46b83)
![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/4a88d789-cd61-405b-b724-93993df6b875)

Y encontraremos nuestro .jar de nuestro componente, dando doble clic sobre él. Mostrándonos así los componentes que se pueden añadir, en este caso es el “BotonPDF”.
Le daremos clic y después a next. 

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/6d9a96d5-f3ab-4c9b-bd54-d7ffe30300d2)

Para finalmente indicarnos en que categoría queremos agregarlo, en nuestro caso decidimos agregarlo a beans, ya que es una categoría que no tiene muchos componentes.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/9542df34-69bc-451e-bf95-7e6ccbf97d1f)

Ya con esto, el componente debe arrastrarse de manera correcta y puede ser implementada a la paleta de botones.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/27eb9c18-6759-4111-832c-298bde3396fa)

¡Y finalmente tu componente está Listo!

Si eres mas de videos que de imagenes te dejamos un video mostrando todos estos pasos!

[https://www.youtube.com/watch?v=tmuv7lQQ4g4](https://www.youtube.com/watch?v=tmuv7lQQ4g4)


## Uso

Una manera de utilizar el `BotonPDF` es la siguiente:

Para el uso de este componente podemos hacer lo siguiente, tenderemos nuestro botón dentro de un Jframe

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/b4a1529b-62c3-4f8f-a034-b62a3f0fec29)

Dentro del Botón en el apartado de ActionPerformed, podremos hacer los siguientes cambios.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/adebe255-40ec-42c6-a442-366f927186d9)

Para probar el funcionamiento correcto de este componente, hemos hecho lo siguiente.

```java
private void botonPDF1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        Paragraph aux = new Paragraph("Hola Muy Buenas Noches Mi Estimado, Te Las Desea Don Pollo!");
        Paragraph aux1 = new Paragraph("Buenas NochesTe Las Desea Don Pollo!");
        String nombre = "Daniel Eduardo";
        String membresia = "Con la compra de un Pollo Feliz estilo Americano";
        String precio = " $700";
```

Como principalmente estaba destinado a ser un registro de un gimnasio las variables que se le declararon son con la finalidad de este mismo.
Aquí declaramos los textos que pueden ser modificados a gusto y criterio propio; como se mencionó en el API.
Para nuestro ejemplo lo hicimos de una rosticería.

 ```java
 System.out.println("ArchivoDePrueba " + botonPDF1.getFechaFinal());      
        String PDFn = "Registro de " + nombre + " " +".pdf"; 
        
        botonPDF1.setNombrePDF(PDFn);
        botonPDF1.setTexto1(aux);//
        botonPDF1.setTitulo(aux);//
        botonPDF1.setDespedida(aux1);//
        botonPDF1.setNombreEnParrafo(nombre);//
        botonPDF1.setTipoEnParrafo(membresia);//
        botonPDF1.setPrecioEnParrafo(precio);//
```

La parte superior nos hace la referencia de cómo se llamará el archivo PDF que se creará.
Con los textos personalizados de las variables, vamos a estar llamando a cada método y así mismo a los mensajes correspondientes.

 ```java
      String ruta = "C:\\Users\\Luis Gael\\Downloads\\pollo.jpeg";//
        Image Donpollio = null;
        try {
            Donpollio = new Image(ImageDataFactory.create(ruta));
        } catch (MalformedURLException ex) {
            Logger.getLogger(xd.class.getName()).log(Level.SEVERE, null, ex);
        }
        botonPDF1.setLogo(Donpollio);
    }
```

Para poder cambiar la imagen se requiere de una ruta específica para poder modificarlo, en este caso la imagen es de “Don Pollo”.
Para finalmente settear la imagen.

Ejecutaremos nuestro Jframe que contiene al botón y se mostrara de la siguiente manera.

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/b5616a4c-7b31-4313-ac8c-ddcf8e33f58b)

Daremos clic sobre él y nos mostrara lo siguiente:

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/53b46cd8-44cc-4180-8894-c76b60ca6960)

Daremos que si para así pasar a nuestro archivo PDF modificado.

**Antes**

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/7d7febd4-6108-4cdd-a3c4-504642461f57)


**Despues**

![image](https://github.com/Danielinh0/ITO_U2_PDFBoton/assets/168349271/34169b90-5ce5-49f7-8ba0-d2a61ba934fb)


Aqui tenemos otro ejemplo del uso de este componente, ¡Checalo!

[https://www.youtube.com/watch?v=reazODTY2HU](https://www.youtube.com/watch?v=reazODTY2HU)


# Autores

Daniel Eduardo Garcia Salvador    
@danielinh_0

Luis Gael Fernadez Crisanto       
@gaelf_04

# Agradecimientos
- A mi madre por llamarme futuro ingeniero
- Y a Natanel por su musica












