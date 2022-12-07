CREATE TABLE usuario (
    id                  BIGINT(20)   PRIMARY KEY AUTO_INCREMENT,
    nome                VARCHAR(80)  NOT NULL,
    data_nascimento     DATE         NOT NULL,
    email               VARCHAR(80)  NOT NULL,
    telefone            VARCHAR(20)  NOT NULL,
    login               VARCHAR(50)  NOT NULL,
    senha               VARCHAR(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO usuario (nome, data_nascimento, email, telefone, login, senha)
VALUES ('Valk Luiz de Oliveira Castellani', '1975-11-05', 'valkcastellani@gmail.com', 
'+55 21 99828-0801', 'valkcastellani', '$2a$10$lgMTkl2e.FWCbnieE5l3teQA3YFzHgzxJuYJ568p.Bwz/rM.Gr0pm');