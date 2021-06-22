-- INSERT PLANS --

INSERT INTO PLAN (ID, NAME, DESCRIPTION, MONTHLY_PRICE)
VALUES (1, 'Pigmeu', 'Com o Plano Pigmeu seu pet terá acesso a: Consultas e plantão Consultas virtuais Consultas de Urgência e Emergência Vacinas Exames laboratoriais Exames de imagem básicos Procedimentos clínicos Tudo isso por apenas R$ [] mensais!', '70,00');
INSERT INTO PLAN (ID, NAME, DESCRIPTION, MONTHLY_PRICE)
VALUES (2, 'Comum', 'Com o Plano Comum seu pet terá acesso a: Todos os benefícios do plano anterior Cirurgias Anestesia local e injetável Exames cardiovasculares Benefícios acrescidos por apenas R$ [] mensais!', '140,00');
INSERT INTO PLAN (ID, NAME, DESCRIPTION, MONTHLY_PRICE)
VALUES (3, 'Nilo', 'Com o Plano Nilo seu pet terá acesso a: Todos os benefícos dos planos anteriores Visitas a petshops Especialistas Internação, Todas as vantagens por apenas R$ [] mesais!', '180,00');

-- INSERT CLIENTS --

INSERT INTO CLIENT (ID, ID_PLAN, NAME, EMAIL, PASSWORD, ADDRESS, CPF, DATE_OF_BIRTH)
VALUES (1, 1, 'Tony Stark', 't.stark@avenger.com', '40bd001563085fc35165329ea1ff5c5ecbdbbeef', 'Avengers Tower', '5', '29/03/1970');
INSERT INTO CLIENT (ID, ID_PLAN, NAME, EMAIL, PASSWORD, ADDRESS, CPF, DATE_OF_BIRTH)
VALUES (2, 1, 'Steve Rogers', 's.rogers@avenger.com', '40bd001563085fc35165329ea1ff5c5ecbdbbeef', 'Avengers Tower', '', '');
INSERT INTO CLIENT (ID, ID_PLAN, NAME, EMAIL, PASSWORD, ADDRESS, CPF, DATE_OF_BIRTH)
VALUES (3, 1, 'Thor', 't.odinson@avenger.com', '40bd001563085fc35165329ea1ff5c5ecbdbbeef', 'Avengers Tower', '', '');
INSERT INTO CLIENT (ID, ID_PLAN, NAME, EMAIL, PASSWORD, ADDRESS, CPF, DATE_OF_BIRTH)
VALUES (4, 1, 'Bruce Banner', 'b.banner@avenger.com', '40bd001563085fc35165329ea1ff5c5ecbdbbeef', 'Avengers Tower', '', '');
INSERT INTO CLIENT (ID, ID_PLAN, NAME, EMAIL, PASSWORD, ADDRESS, CPF, DATE_OF_BIRTH)
VALUES (5, 1, 'Natasha Romanoff', 'n.romanoff@avenger.com', '40bd001563085fc35165329ea1ff5c5ecbdbbeef', 'Avengers Tower', '', '');
INSERT INTO CLIENT (ID, ID_PLAN, NAME, EMAIL, PASSWORD, ADDRESS, CPF, DATE_OF_BIRTH)
VALUES (6, 1, 'Clint Barton', 'c.barton@avenger.com', '40bd001563085fc35165329ea1ff5c5ecbdbbeef', 'Avengers Tower', '', '');

-- INSERT PETS --

INSERT INTO PET (ID, ID_CLIENT, NAME, SPECIES, SIZE_TYPE, DATE_OF_BIRTH)
VALUES (1, 1, 'Name1', 'Species', 'Size Type', 'Date of Birth');
INSERT INTO PET (ID, ID_CLIENT, NAME, SPECIES, SIZE_TYPE, DATE_OF_BIRTH)
VALUES (2, 2, 'Name2', 'Species', 'Size Type', 'Date of Birth');
INSERT INTO PET (ID, ID_CLIENT, NAME, SPECIES, SIZE_TYPE, DATE_OF_BIRTH)
VALUES (3, 2, 'Name3', 'Species', 'Size Type', 'Date of Birth');

-- INSERT BUSINESSES --
INSERT INTO BUSINESS (ID, NAME, ADDRESS, CNPJ, BUSINESS_TYPE, SERVICES_AVAILABLE)
VALUES (1, 'PetCenter', 'São Paulo', '32412384-19', 'Vet', 'SERVICES_AVAILABLE');
INSERT INTO BUSINESS (ID, NAME, ADDRESS, CNPJ, BUSINESS_TYPE, SERVICES_AVAILABLE)
VALUES (2, 'PetLeft', 'Santo André', '32412384-19', 'Vet', 'SERVICES_AVAILABLE');
INSERT INTO BUSINESS (ID, NAME, ADDRESS, CNPJ, BUSINESS_TYPE, SERVICES_AVAILABLE)
VALUES (3, 'PetRight', 'Barueri', '32412384-19', 'Vet', 'SERVICES_AVAILABLE');
INSERT INTO BUSINESS (ID, NAME, ADDRESS, CNPJ, BUSINESS_TYPE, SERVICES_AVAILABLE)
VALUES (4, 'PetTop', 'Jundiaí', '32412384-19', 'Vet', 'SERVICES_AVAILABLE');
INSERT INTO BUSINESS (ID, NAME, ADDRESS, CNPJ, BUSINESS_TYPE, SERVICES_AVAILABLE)
VALUES (5, 'PetDown', 'Ubatuba', '32412384-19', 'Vet', 'SERVICES_AVAILABLE');

-- INSERT BUSINESS_PLANS --
INSERT INTO BUSINESS_PLAN (ID, ID_PLAN, ID_BUSINESS)
VALUES (1, 1, 1);

-- INSERT APPOINTMENTS --
INSERT INTO APPOINTMENT (ID, ID_PET, ID_BUSINESS, APPOINTMENT_DATE, SERVICE_TYPE)
VALUES (1, 1, 1, 'APPOINTMENT_DATE', 'SERVICE_TYPE');

