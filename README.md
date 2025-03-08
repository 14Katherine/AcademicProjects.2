# AcademicProjects.2
Gestión de proyectos academicos para empresas
DECISIONES DE DISEÑO DE LA ARQUITECTURA
Se ha adoptado una arquitectura en capas para lograr una mejor separación de responsabilidades, facilitando la mantenibilidad y escalabilidad del sistema.
El sistema sigue el modelo de tres capas, asegurando una organización clara y estructurada:
1.co.edu.unicauca.layersmvc.access
   1.1 Se encarga de la interacción con la base de datos.
    1.2Contiene las clases encargadas de la persistencia de los datos, como CompanyRepository y ProjectRepository.
2.co.edu.unicauca.layersmvc.domain.domain
 2.1Define las entidades  Company y Project y contiene el servicio como ServiceCompany , que aplican reglas de negocio y 
  validaciones.Actúa como intermediario entre la capa de datos y la capa de presentación.
3.co.edu.unicauca.layersmvc.presentacion
  3.1Maneja la interfaz de usuario,se comunica con la capacidad de negocio a través de los controladores.
-----------------------------------------------------------------------------------------------------------------
Dentro de la capa de presentacion se implemento el patron MVC
Modelo(layersmvc/domain) representa los datos y la logica del negocio
Vista(layersmvc/presentacion) gestiona la interfaz grafica
controlador (layersmvc/domain/service) actua como intermediario entre el modelo y la vista
-----------------------------------------------------------------------------------------------------
Se crean diferentes repositorios para cada entidad de la capa de dominio,cada repositorio se encarga exclusivamente de una entidad específica, evitando que una sola clase maneje múltiples tipos de datos. Esta decision se basa en el principio Principio de Responsabilidad Única.

