# tiendavirtual
Bienvenido/a al repositorio de la Tienda Virtual del Salvation Army. Este proyecto tiene como objetivo desarrollar una plataforma en línea para facilitar la compra de productos y apoyar las iniciativas benéficas del Salvation Army.

## Descripción

El proyecto de Salvation Army tiene como objetivo principal facilitar la gestión de donaciones y recursos para esta organización benéfica. Salvation Army es una organización internacional que busca brindar asistencia y apoyo a comunidades necesitadas en todo el mundo. Este proyecto se centra en el desarrollo de una plataforma tecnológica que permita a Salvation Army administrar eficientemente sus donaciones, gestionar sus recursos y coordinar sus esfuerzos humanitarios.

## Análisis

El análisis inicial del proyecto identificó varias áreas clave de mejora en la gestión de donaciones y recursos por parte de Salvation Army. Estas incluyen la necesidad de una plataforma centralizada para registrar, rastrear y distribuir donaciones, así como para coordinar voluntarios y gestionar proyectos humanitarios. Además, se reconoció la importancia de garantizar la transparencia y la trazabilidad de las donaciones para generar confianza entre los donantes y mejorar la eficiencia operativa de la organización.

## Solución

La solución propuesta consiste en el desarrollo de una aplicación web personalizada que integra funcionalidades clave para la gestión de donaciones y recursos de Salvation Army. La aplicación permitirá a los usuarios realizar donaciones en línea, registrar y rastrear el inventario de recursos, coordinar la asignación de voluntarios a proyectos específicos y generar informes detallados sobre el uso de los fondos y recursos. Además, se implementarán medidas de seguridad robustas y controles de acceso para garantizar la integridad y confidencialidad de los datos de donantes y beneficiarios.

## La arquitectura

La arquitectura propuesta consta de varios componentes interconectados para construir una aplicación web escalable. En la capa frontal, el "Cliente Web" interactúa con un "Servidor Web" que maneja las solicitudes HTTP utilizando Apache HTTP Server. Opcionalmente, se puede agregar un "Balanceador de Carga" para distribuir las solicitudes entrantes entre múltiples servidores de aplicaciones.

En la siguiente capa, los "Servidores de Aplicaciones" como Apache Tomcat o Java EE reciben las solicitudes HTTP y las dirigen hacia la "Capa de Lógica de Negocio", donde se procesan y manejan mediante controladores, servicios y repositorios Java. Esta capa encapsula la lógica de negocio de la aplicación, incluyendo la gestión de productos, usuarios y pedidos.

Finalmente, la información se almacena y recupera desde una "Base de Datos", como MySQL, que contiene tablas para productos, usuarios y pedidos. Esta arquitectura permite una separación clara de responsabilidades y escalabilidad, facilitando el desarrollo y mantenimiento de la aplicación web.


## Características Principales

- Catálogo de productos con imágenes, descripciones y precios.
- Carrito de compras para agregar y gestionar los productos seleccionados.
- Proceso de pago seguro y fácil de usar con opciones de envío y facturación.
- Gestión de cuentas de usuario con opciones de registro, inicio de sesión y perfil.
- Sistema de soporte al cliente para resolver preguntas y problemas de los usuarios.
- Medidas de seguridad para proteger la información personal y financiera de los usuarios.

## Tecnologías Utilizadas

- Frontend: HTML, CSS, JavaScript (React.js)
- Backend: Node.js, Express.js
- Base de Datos: MongoDB
- Otros: Git, GitLab, Zube, Travis-Ci (administrador de proyectos)

## Instalación

1. Clona este repositorio en tu máquina local.
2. Instala las dependencias del proyecto utilizando npm:
npm install

markdown
Copy code
3. Inicia el servidor de desarrollo:
npm start

less
Copy code
4. Abre tu navegador y visita http://localhost:3000 para ver la tienda virtual en acción.




