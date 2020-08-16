# latamTestOrianaRivas
_Backend latam test, proyecto diseñado para calcular tanto la edad como los días faltantes para su próximo cumpleaños, para ello el usuario debe ingresar sus datos, tales como nombre y fecha de nacimiento, el proyecto hará el calculo automatico y exhibirá los resultados correspondientes a este, si la persona que ingresa sus datos justamente está de cumpleaños, el proyeto lanzará un poema al azar como regalo. _

## Comenzando con el Despliegue 🚀

_Cree una nueva carpeta vacia 
_Abra su consola de comando dentro de la nueva carpeta creada 
_Luego copie (git clone https://github.com/oriirivas/latamTestOrianaRivas.git) 
_Ahora pegelo en su consola (este comando le descargará el repositorio completo del proyecto).
Para ejecutar el proyecto ya descargado será necesario abrirlo en algún IDE de preferencia, ya sea Intellij, Eclipse, entre otros y correr el proyecto.

_http://localhost:8080/swagger-ui.html#/person-controller link para ingresar al swagger del proyecto

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