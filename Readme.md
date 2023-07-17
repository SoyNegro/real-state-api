# Real-State API

A small REST API with CRUD functionalities to manage Real State listings.

### Stack

- Spring Boot 3
- MongoDB
- Java 17
- Maven
- Docker

Connection to `MongoDB` can be configured through environment variables, `DB_URL`, `DB_USER` and `DB_PASS`.

### Endpoints
- `GET` [/api/listings/{countryCode}]()
    - `Parameters`
        - `Query`
            - page: `integer`(optional) default = 0
            - size: `integer` (optional) default = 50
        - `Path`
            - countryCode : `String` 
    - `Response`
        - A `List<ListingReponse>` of given `size` containing the listings filtered by `countryCode` in page `page`


- `GET` [/api/listings/{countryCode}/{city}]()
    - `Parameters`
        - `Query`
            - page: `integer`(optional) default = 0
            - size: `integer` (optional) default = 50
        - `Path`
            - countryCode : `String`
            - city: `String`
  - `Response`
      - A `List<ListingReponse>` of given `size` containing the listings filtered by `countryCode` and `city` in page `page`


- `GET` [/api/listings/{countryCode}/{city}/{neighborhood}]()
    - `Parameters`
        - `Query`
            - page: `integer`(optional) default = 0
            - size: `integer` (optional) default = 50
        - `Path`
            - countryCode : `String`
            - city: `String`
            - neighborhood: `String`
  - `Response`
      - A `List<ListingReponse>` of given `size` containing the listings filtered by `countryCode`,`city` and `neighborhood` in page `page`


- `GET` [/api/listings/{id}]()
    - `Parameters`
        - `Path`
            - id: `String`
    - `Response`
      - `ListingReponse` 


-  `POST` [/api/listings]()
    - `Parameters`
        - `Body`
            -  `ListingRequest`
   - `Response`
       - `ListingReponse`


-  `PUT` [/api/listings/{id}]()
    - `Parameters`
        - `Path`
           - id: `String`
        - `Body`
            -  `ListingRequest`
    - `Response`
        - `ListingReponse`


- `DELETE` [/api/listings/{id}]()
    - `Parameters`
        - `Path`
            - id: String
  - `Response`
      - `ListingReponse`


- `GET` [/api/listings/show/{id}]()
    - `Parameters`
        - `Path`
            - id: `String`
    - `Response`
        - id:`String`


- `GET` [/api/listings/hide/{id}]()
    - `Parameters`
        - `Path`
            - id: `String`
    - `Response`
        - id:`String`

### Launch

You can run the spring boot app by typing the following commands:

```
mvn spring-boot:run
```

The server will start on port `8080`.

You can also package the application in the form of a `jar` file and then run it like so:

```
mvn clean package 

java -jar target/RealState-1.0.jar
```



