CREATE TABLE detail_product_entity
(
    id             BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    number         INTEGER                                 NOT NULL,
    id_product_id  BIGINT,
    total          DOUBLE PRECISION                        NOT NULL,
    sale_entity_id BIGINT,
    CONSTRAINT pk_detailproductentity PRIMARY KEY (id)
);

CREATE TABLE product_entity
(
    id                    BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    state                 VARCHAR,
    name                  VARCHAR(255),
    description           VARCHAR(255),
    number                INTEGER                                 NOT NULL,
    price_purveyor        DOUBLE PRECISION                        NOT NULL,
    price_sale            DOUBLE PRECISION                        NOT NULL,
    image                 VARCHAR(255),
    type                  VARCHAR,
    id_purveyor_entity_id BIGINT,
    CONSTRAINT pk_productentity PRIMARY KEY (id)
);

CREATE TABLE purveyor_entity
(
    id      BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    state   VARCHAR,
    name    VARCHAR(255),
    contact VARCHAR(255),
    CONSTRAINT pk_purveyorentity PRIMARY KEY (id)
);

CREATE TABLE receipt_entity
(
    id         BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    date       date,
    chief      VARCHAR(255),
    cash       DOUBLE PRECISION                        NOT NULL,
    change     DOUBLE PRECISION                        NOT NULL,
    total      DOUBLE PRECISION                        NOT NULL,
    id_sale_id BIGINT,
    CONSTRAINT pk_receiptentity PRIMARY KEY (id)
);

CREATE TABLE role_entity
(
    id   BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name VARCHAR(255),
    CONSTRAINT pk_roleentity PRIMARY KEY (id)
);

CREATE TABLE sale_entity
(
    id            BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    state         VARCHAR,
    name          VARCHAR(255),
    date_created  date,
    date_paid     date,
    total         DOUBLE PRECISION                        NOT NULL,
    type_payment  VARCHAR,
    fees_paid     INTEGER                                 NOT NULL,
    list_products INTEGER                                 NOT NULL,
    id_user_id    BIGINT,
    CONSTRAINT pk_saleentity PRIMARY KEY (id)
);

CREATE TABLE user_entity
(
    id       BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    state    VARCHAR,
    name     VARCHAR(255),
    lastname VARCHAR(255),
    email    VARCHAR(255),
    cedula   VARCHAR(255),
    phone    VARCHAR(255),
    address  VARCHAR(255),
    role_id  BIGINT,
    CONSTRAINT pk_userentity PRIMARY KEY (id)
);

ALTER TABLE detail_product_entity
    ADD CONSTRAINT FK_DETAILPRODUCTENTITY_ON_IDPRODUCT FOREIGN KEY (id_product_id) REFERENCES product_entity (id);

ALTER TABLE detail_product_entity
    ADD CONSTRAINT FK_DETAILPRODUCTENTITY_ON_SALEENTITY FOREIGN KEY (sale_entity_id) REFERENCES sale_entity (id);

ALTER TABLE product_entity
    ADD CONSTRAINT FK_PRODUCTENTITY_ON_IDPURVEYORENTITY FOREIGN KEY (id_purveyor_entity_id) REFERENCES purveyor_entity (id);

ALTER TABLE receipt_entity
    ADD CONSTRAINT FK_RECEIPTENTITY_ON_IDSALE FOREIGN KEY (id_sale_id) REFERENCES sale_entity (id);

ALTER TABLE sale_entity
    ADD CONSTRAINT FK_SALEENTITY_ON_IDUSER FOREIGN KEY (id_user_id) REFERENCES user_entity (id);

ALTER TABLE user_entity
    ADD CONSTRAINT FK_USERENTITY_ON_ROLE FOREIGN KEY (role_id) REFERENCES role_entity (id);