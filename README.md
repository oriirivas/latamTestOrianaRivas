# latamTestOrianaRivas
_Backend latam test, proyecto diseñado para calcular tanto la edad como los días faltantes para su próximo cumpleaños, para ello el usuario debe ingresar sus datos, tales como nombre y fecha de nacimiento, el proyecto hará el calculo automatico y exhibirá los resultados correspondientes a este, si la persona que ingresa sus datos justamente está de cumpleaños, el proyeto lanzará un poema al azar como regalo. _

## Comenzando con el Despliegue 🚀

_Cree una nueva carpeta vacia 
_Abra su consola de comando dentro de la nueva carpeta creada 
_Luego copie (git clone https://github.com/oriirivas/latamTestOrianaRivas.git) 
_Ahora pegelo en su consola (este comando le descargará el repositorio completo del proyecto).
Para ejecutar el proyecto ya descargado será necesario abrirlo en algún IDE de preferencia, ya sea Intellij, Eclipse, entre otros y correr el proyecto.

_http://localhost:8080/swagger-ui.html#/person-controller link para ingresar al swagger del proyecto
_https://github.com/oriirivas/latamTestFrontOriana link to front repository

### Pre-requisitos 📋

Que cosas necesitas para instalar el software y como instalarlas

Para poder correr el proyecto necesitará installar lo siguiente 
_Jdk Java 8
_Apache Maven 3.6.3
_Ide de preferencia (recomiendo IntelliJ)


### Instalación 🔧

Para instalar Jdk Java 8

_Paso 1: Ir al (https://www.oracle.com/cl/java/technologies/javase/javase-jdk8-downloads.html) Haga clic en Descargar JDK. Para la última versión de Java (ya sea para windows, mac o linux).

_Paso 2: Aceptar acuerdo de licencia, Descargue el último Java JDK para su versión (32 o 64 bit) de java para Windows.

_Paso 3: Una vez que se complete la descarga, ejecute el exe para instalar JDK. Haga clic en Siguiente

_Paso 4: Una vez completada la instalación, haga clic en Cerrar

_Paso 5: Haga clic con el botón derecho en Mi PC y seleccione las propiedades

_Paso 6: Haz clic en la configuración avanzada del sistema

_Paso 7: Haga clic en Variables de entorno

_Paso 8: Haga clic en nuevas Variables de entorno para crear una nueva variable.

_Paso 9: Escriba PATH en el nombre de la variable.

_Paso 10: Copie la ruta de la carpeta bin que está instalada en la carpeta JDK.

_Paso 11: Pegue la carpeta Path of bin en Variable value y haga clic en OK Button.

_Paso 12: Haga clic en el botón Aceptar.

con esto deberiamos tener nuetro JDK java instalado en nuestro sistema operativo windows.



Para instalar Apache maven 3.6.3

_Paso 1:Accedemos a la página web de Maven y descargamos la última versión disponible (http://maven.apache.org/download.cgi#Installation)

_Paso 2:Descomprimimos el archivo en C:/maven, de modo que todos los archivos de Maven se encontrarán en C:/maven/apache-maven-x.x.x

_Paso 3:Configuramos las variables de entorno al igual que lo hicimos en el caso anterior. En este caso añadiríamos:
M2: %M2_HOME%\bin
M2_HOME: C:\maven\apache-maven-x.x.x
PATH: …;C:\maven\apache-maven-x.x.x\bin; …

_Paso 4:Accedemos al terminal y escribirmos «mvn –version«. Asegure de que el terminal no estaba abierto cuando modifico las variables de entorno, porque entonces no reconocerá estas variables. Debe cerrarlo y volverlo a abrir. Si todo está bien le mostrará la versión de Maven instalada.



Para instalar IntelliJ

_Paso 1: Ingresa a (https://www.jetbrains.com/idea/promo/ultimate/?gclid=EAIaIQobChMI0OC5yp6g6wIViASRCh2unA5tEAAYASAAEgKEofD_BwE)

_Paso 2: Haga click en download y espere a que el archivo descargue.

_Paso 3: Una vez la descarga se complete, haga click en el exe para Instalar intelliJ Idea.

_Paso 4: Dar next sin cambiar ninguna configuración predeterminada hasta que comience la instalación.

_paso 5: Una vez terminada la instalación, ejecutar intelliJ.



## Notas de Despliegue 📦

Las instrucciones antes mencionados son unicamente para el sistema opartivo windows, para otros sistemas tales como mac y linux poseen pasos diferentes de instalación, los cuales varian en cada caso.

## Construido con 🛠️

Menciona las herramientas que utilizaste para crear tu proyecto

* [IntelliJ](https://www.jetbrains.com/) - El Ide utilizado
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Java jdk 8 ](https://www.oracle.com/cl/java/)


project designed to calculate both the age and the days remaining for their next birthday, for this the user must enter their data, such as name and date of birth, the project will make the automatic calculation and display the results corresponding to this, if the person When you enter your data just on your birthday, the project will launch a random poem as a gift. _

## Starting 🚀

_Create a new empty folder
_Open your command console inside the new folder created
_Then copy (git clone https://github.com/oriirivas/latamTestOrianaRivas.git)
_Now paste it into your console (this command will download the complete project repository).
To run the downloaded project, it will be necessary to open it in a preferred IDE, be it Intellij, Eclipse, among others, and run the project.

See * Deployment * to know how to deploy the project.


### Pre-requisites 📋

What things do you need to install the software and how to install them

In order to run the project you will need to install the following
_Jdk Java 8
_Apache Maven 3.6.3
_Ide of preference (I recommend IntelliJ)


### Installation 🔧

To install Jdk Java 8

_Step 1: Go to (https://www.oracle.com/cl/java/technologies/javase/javase-jdk8-downloads.html) Click Download JDK. For the latest version of Java (either for windows, mac or linux).

_Step 2: Accept license agreement, Download the latest Java JDK for your version (32 or 64 bit) of java for Windows.

_Step 3: Once the download is complete, run the exe to install JDK. Click Next

_Step 4: Once the installation is complete, click Close

_Step 5: Right click on My Computer and select the properties

_Step 6: Click on advanced system settings

_Step 7: Click Environment Variables

_Step 8: Click on New Environment Variables to create a new variable.

_Step 9: Write PATH in the variable name.

_Step 10: Copy the path of the bin folder that is installed in the JDK folder.

_Step 11: Paste Path of bin folder in Variable value and click OK Button.

_Step 12: Click the OK button.

with this we should have our java JDK installed in our windows operating system.



To install Apache maven 3.6.3

_Step 1: We access the Maven website and download the latest version available (http://maven.apache.org/download.cgi#Installation)

_Step 2: Unzip the file in C: / maven, so that all Maven files will be found in C: /maven/apache-maven-x.x.x

_Step 3: We configure the environment variables as we did in the previous case. In this case we would add:
M2:% M2_HOME% \ bin
M2_HOME: C: \ maven \ apache-maven-x.x.x
PATH:…; C: \ maven \ apache-maven-x.x.x \ bin; ...

_Step 4: We access the terminal and write «mvn –version«. Make sure the terminal was not open when I modify the environment variables, because then it will not recognize these variables. You must close it and reopen it. If all is well it will show you the version of Maven installed.



To install IntelliJ

_Step 1: Enter (https://www.jetbrains.com/idea/promo/ultimate/?gclid=EAIaIQobChMI0OC5yp6g6wIViASRCh2unA5tEAAYASAAEgKEofD_BwE)

_Step 2: Click on download and wait for the file to download.

_Step 3: Once the download is complete, click on the exe to Install intelliJ Idea.

_Step 4: Give next without changing any default settings until the installation begins.

_step 5: Once the installation is finished, run intelliJ.



## Deployment Notes 📦

The aforementioned instructions are only for the windows or partition system, for other systems such as mac and linux have different installation steps, which vary in each case.

## Built with 🛠️

Mention the tools you used to create your project

* [IntelliJ] (https://www.jetbrains.com/) - The Ide used
* [Maven] (https://maven.apache.org/) - Dependency manager
* [Java jdk 8] (https://www.oracle.com/cl/java/)