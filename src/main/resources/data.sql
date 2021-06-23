-- INSERT PLANS --

INSERT INTO PLAN (ID, NAME, DESCRIPTION, MONTHLY_PRICE)
VALUES (1, 'Pigmeu', 'Com o Plano Pigmeu seu pet terá acesso a: Consultas e plantão Consultas virtuais Consultas de Urgência e Emergência Vacinas Exames laboratoriais Exames de imagem básicos Procedimentos clínicos Tudo isso por apenas R$ [] mensais!', '70,00');
INSERT INTO PLAN (ID, NAME, DESCRIPTION, MONTHLY_PRICE)
VALUES (2, 'Comum', 'Com o Plano Comum seu pet terá acesso a: Todos os benefícios do plano anterior Cirurgias Anestesia local e injetável Exames cardiovasculares Benefícios acrescidos por apenas R$ [] mensais!', '140,00');
INSERT INTO PLAN (ID, NAME, DESCRIPTION, MONTHLY_PRICE)
VALUES (3, 'Nilo', 'Com o Plano Nilo seu pet terá acesso a: Todos os benefícos dos planos anteriores Visitas a petshops Especialistas Internação, Todas as vantagens por apenas R$ [] mesais!', '180,00');

-- INSERT CLIENTS --

INSERT INTO CLIENT (ID, ID_PLAN, NAME, EMAIL, PASSWORD, ADDRESS, CPF, DATE_OF_BIRTH)
VALUES (1, 1, 'Tony Stark', 't.stark@avenger.com', '123', 'Avengers Tower', '38298961072', '29/03/1970');
INSERT INTO CLIENT (ID, ID_PLAN, NAME, EMAIL, PASSWORD, ADDRESS, CPF, DATE_OF_BIRTH)
VALUES (2, 1, 'Steve Rogers', 's.rogers@avenger.com', '123', 'Avengers Tower', '53514687005', '04/07/1918');
INSERT INTO CLIENT (ID, ID_PLAN, NAME, EMAIL, PASSWORD, ADDRESS, CPF, DATE_OF_BIRTH)
VALUES (3, 1, 'Thor', 't.odinson@avenger.com', '123', 'Avengers Tower', '03362726003', '01/01/2000');
INSERT INTO CLIENT (ID, ID_PLAN, NAME, EMAIL, PASSWORD, ADDRESS, CPF, DATE_OF_BIRTH)
VALUES (4, 1, 'Bruce Banner', 'b.banner@avenger.com', '123', 'Avengers Tower', '01131151054', '01/01/2000');
INSERT INTO CLIENT (ID, ID_PLAN, NAME, EMAIL, PASSWORD, ADDRESS, CPF, DATE_OF_BIRTH)
VALUES (5, 1, 'Natasha Romanoff', 'n.romanoff@avenger.com', '123', 'Avengers Tower', '98131388077', '01/01/2000');
INSERT INTO CLIENT (ID, ID_PLAN, NAME, EMAIL, PASSWORD, ADDRESS, CPF, DATE_OF_BIRTH)
VALUES (6, 1, 'Clint Barton', 'c.barton@avenger.com', '123', 'Avengers Tower', '18534663017', '01/01/2000');

-- INSERT PETS --

INSERT INTO PET (ID, ID_CLIENT, NAME, SPECIES, SIZE_TYPE, DATE_OF_BIRTH)
VALUES (1, 1, 'Dentinho', 'Cão', 'Grande', '30/01/2015');
INSERT INTO PET (ID, ID_CLIENT, NAME, SPECIES, SIZE_TYPE, DATE_OF_BIRTH)
VALUES (2, 1, 'Adilson', 'Cão', 'Pequeno', '29/04/2016');
INSERT INTO PET (ID, ID_CLIENT, NAME, SPECIES, SIZE_TYPE, DATE_OF_BIRTH)
VALUES (3, 2, 'Lucky', 'Cão', 'Médio', '02/05/2010');
INSERT INTO PET (ID, ID_CLIENT, NAME, SPECIES, SIZE_TYPE, DATE_OF_BIRTH)
VALUES (4, 2, 'Leona', 'Cão', 'Grande', '03/08/2012');

-- INSERT BUSINESSES --
INSERT INTO BUSINESS (ID, NAME, ADDRESS, CNPJ, BUSINESS_TYPE, SERVICES_AVAILABLE)
VALUES (1, 'PetCenter', 'São Paulo', '32412384-19', 'Veterinário', 'Checkup, Castração, Exames de sangue, Vacinação');
INSERT INTO BUSINESS (ID, NAME, ADDRESS, CNPJ, BUSINESS_TYPE, SERVICES_AVAILABLE)
VALUES (2, 'PetLeft', 'Santo André', '32412384-19', 'Veterinário', 'Checkup, Castração, Vacinação');
INSERT INTO BUSINESS (ID, NAME, ADDRESS, CNPJ, BUSINESS_TYPE, SERVICES_AVAILABLE)
VALUES (3, 'PetRight', 'Barueri', '32412384-19', 'Veterinário', 'Checkup, Castração');
INSERT INTO BUSINESS (ID, NAME, ADDRESS, CNPJ, BUSINESS_TYPE, SERVICES_AVAILABLE)
VALUES (4, 'PetTop', 'Jundiaí', '32412384-19', 'Veterinário', 'Checkup, Castração, Exames de ultrassom');
INSERT INTO BUSINESS (ID, NAME, ADDRESS, CNPJ, BUSINESS_TYPE, SERVICES_AVAILABLE)
VALUES (5, 'PetDown', 'Ubatuba', '32412384-19', 'Veterinário', 'Checkup, Castração, Vacinação');

-- INSERT BUSINESS_PLANS --
INSERT INTO BUSINESS_PLAN (ID, ID_PLAN, ID_BUSINESS)
VALUES (1, 1, 1);

-- INSERT APPOINTMENTS --
INSERT INTO APPOINTMENT (ID, ID_PET, ID_BUSINESS, APPOINTMENT_DATE, SERVICE_TYPE)
VALUES (1, 1, 1, '30/06/2021', 'Vacinação');
VALUES (2, 1, 1, '05/07/2021', 'Checkup');
VALUES (3, 2, 2, '20/07/2021', 'Vacinação');
VALUES (4, 2, 2, '23/07/2021', 'Checkup');

