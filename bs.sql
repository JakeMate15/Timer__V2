CREATE DATABASE IF NOT EXISTS speedcubingDB;
USE speedcubingDB;

-- Creación de la tabla Usuarios
CREATE TABLE Usuarios (
    ID_Usuario INT AUTO_INCREMENT PRIMARY KEY,
    NombreUsuario VARCHAR(50) UNIQUE NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    Apellido VARCHAR(100) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    Contrasena VARCHAR(256) NOT NULL,
    FechaRegistro DATE NOT NULL
);

-- Creación de la tabla Categorías
CREATE TABLE Categorias (
    ID_Categoria INT AUTO_INCREMENT PRIMARY KEY,
    NombreCategoria VARCHAR(50) NOT NULL,
    Descripcion VARCHAR(255)
);

-- Creación de la tabla Sesiones
CREATE TABLE Sesiones (
    ID_Sesion INT AUTO_INCREMENT PRIMARY KEY,
    ID_Usuario INT NOT NULL,
    NombreSesion VARCHAR(100) NOT NULL,
    ID_Categoria INT NOT NULL,
    FechaSesion DATE NOT NULL,
    FOREIGN KEY (ID_Usuario) REFERENCES Usuarios(ID_Usuario),
    FOREIGN KEY (ID_Categoria) REFERENCES Categorias(ID_Categoria)
);

-- Creación de la tabla Intentos
CREATE TABLE Intentos (
    ID_Intento INT AUTO_INCREMENT PRIMARY KEY,
    ID_Sesion INT NOT NULL,
    Tiempo DECIMAL(10,2) NOT NULL,
    FechaHora TIMESTAMP NOT NULL,
    Mezcla VARCHAR(255) NOT NULL,
    Comentario VARCHAR(255),
    FOREIGN KEY (ID_Sesion) REFERENCES Sesiones(ID_Sesion)
);

-- Modificar el tipo de dato de la columna Tiempo a int
ALTER TABLE Intentos MODIFY COLUMN Tiempo int NOT NULL;

-- Creación de la tabla Records de Sesión
CREATE TABLE RecordsSesion (
    ID_RecordSesion INT AUTO_INCREMENT PRIMARY KEY,
    ID_Sesion INT NOT NULL,
    TipoRecord VARCHAR(50) NOT NULL,
    Valor DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (ID_Sesion) REFERENCES Sesiones(ID_Sesion)
);

ALTER TABLE RecordsSesion MODIFY COLUMN Valor int NOT NULL;

-- Creación de la tabla Records Globales
CREATE TABLE RecordsGlobales (
    ID_RecordGlobal INT AUTO_INCREMENT PRIMARY KEY,
    ID_Usuario INT NOT NULL,
    ID_Categoria INT NOT NULL,
    TipoRecord VARCHAR(50) NOT NULL,
    Valor DECIMAL(10,2) NOT NULL,
    Fecha DATE NOT NULL,
    FOREIGN KEY (ID_Usuario) REFERENCES Usuarios(ID_Usuario),
    FOREIGN KEY (ID_Categoria) REFERENCES Categorias(ID_Categoria)
);

ALTER TABLE RecordsGlobales MODIFY COLUMN Valor int NOT NULL;
