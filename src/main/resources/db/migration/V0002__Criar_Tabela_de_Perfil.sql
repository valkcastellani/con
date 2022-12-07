CREATE TABLE perfil (
    id             BIGINT(2)   PRIMARY KEY AUTO_INCREMENT,
    nome           VARCHAR(50) NOT NULL,
    administrativo BOOLEAN     NOT NULL DEFAULT FALSE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO perfil (nome, administrativo) VALUES ('Administrador', 1);
INSERT INTO perfil (nome, administrativo) VALUES ('Proprietário', 1);
