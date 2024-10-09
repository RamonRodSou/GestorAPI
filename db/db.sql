-- Criando o banco de dados
CREATE DATABASE igreja;

-- Usando o banco de dados igreja
\c igreja;

-- Criando a tabela de Estado Civil
CREATE TABLE estado_civil (
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(50) NOT NULL
);

-- Inserindo valores para Estado Civil
INSERT INTO estado_civil (descricao) VALUES ('SOLTEIRO'), ('CASADO'), ('DIVORCIADO'), ('VIUVO'), ('SEPARADO');

-- Criando a tabela de Função
CREATE TABLE funcao (
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(50) NOT NULL
);

-- Inserindo valores para Função
INSERT INTO funcao (descricao) VALUES ('PASTOR'), ('LIDER'), ('COLABORADOR'), ('MEMBRO'), ('VISITANTE');

-- Criando a tabela de Cargo
CREATE TABLE cargo (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    nome VARCHAR(255) NOT NULL
);

-- Criando a tabela de Grupo de Crescimento
CREATE TABLE grupo_crescimento (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    nome VARCHAR(255) NOT NULL,
    local VARCHAR(255),
    cargo_id UUID,
    CONSTRAINT fk_cargo_grupo FOREIGN KEY (cargo_id) REFERENCES cargo(id)
);

-- Criando a tabela de Pessoa
CREATE TABLE pessoa (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    nome VARCHAR(255) NOT NULL,
    sobrenome VARCHAR(255),
    email VARCHAR(255),
    telefone VARCHAR(15),
    estado_civil_id INTEGER,
    cpf VARCHAR(11),
    data_nascimento DATE,
    data_casamento DATE,
    data_batismo DATE,
    nome_pai VARCHAR(255),
    nome_mae VARCHAR(255),
    cargo_id UUID,
    grupo_crescimento_id UUID,
    funcao_id INTEGER,
    CONSTRAINT fk_estado_civil FOREIGN KEY (estado_civil_id) REFERENCES estado_civil(id),
    CONSTRAINT fk_cargo_pessoa FOREIGN KEY (cargo_id) REFERENCES cargo(id),
    CONSTRAINT fk_grupo_crescimento FOREIGN KEY (grupo_crescimento_id) REFERENCES grupo_crescimento(id),
    CONSTRAINT fk_funcao FOREIGN KEY (funcao_id) REFERENCES funcao(id)
);

-- Inserindo alguns exemplos de cargos
INSERT INTO cargo (nome) VALUES ('Diácono'), ('Músico'), ('Professor');

-- Inserindo alguns exemplos de grupos de crescimento
INSERT INTO grupo_crescimento (nome, local, cargo_id) VALUES ('Grupo Esperança', 'Rua A, 123', NULL), ('Grupo Fé', 'Rua B, 456', NULL);

-- Inserindo exemplos na tabela pessoa
INSERT INTO pessoa (nome, sobrenome, email, telefone, estado_civil_id, cpf, data_nascimento, data_casamento, data_batismo, nome_pai, nome_mae, cargo_id, grupo_crescimento_id, funcao_id)
VALUES
('João', 'Silva', 'joao.silva@gmail.com', '11999999999', 2, '12345678901', '1985-05-10', '2010-06-15', '2005-08-22', 'José Silva', 'Maria Silva', NULL, NULL, 4),
('Ana', 'Souza', 'ana.souza@gmail.com', '11988888888', 1, '98765432109', '1990-07-12', NULL, '2012-09-12', 'Pedro Souza', 'Clara Souza', NULL, NULL, 3);
