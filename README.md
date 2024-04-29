# Backend_Traini8_Mantu-kumar
This project is developed using Java SpringBoot framework and utilizes a SQL database to store data. It consists of two APIs: one for creating new training centers and another for retrieving all training centers.

## APIs
## 1-Create Training Center

Endpoint: /api/TrainingCentre/create

Method: POST

Description: This API accepts JSON data containing details/properties of a new training center. It performs validations on the input data and saves the new training center in the database.

## 2-Get All Training Centers

Endpoint: /api/TrainingCentre/findAll

Method: GET

Description: This API retrieves all available training centers.

## 3-Get Training centre By Id

Endpoint: /api/TrainingCentre/findById

Method: GET

Description: This API retrieves all available training centers with id.

## Testing

You can test these APIs using Swagger or Postman.

##Swagger

Swagger is integrated into the project for easy API testing. Access the Swagger UI by navigating to http://localhost:8080/swagger-ui/index.html#/ after starting the application. Swagger UI

![Screenshot 2024-04-29 133903](https://github.com/mantu1234567/Backend_Traini8_Mantu-kumar/assets/114673693/29bae409-1cec-4b97-9a6b-78484836f1ea)

![Screenshot 2024-04-29 135507](https://github.com/mantu1234567/Backend_Traini8_Mantu-kumar/assets/114673693/0ddf3c42-184c-4af4-ad48-800f1b544a6f)

![Screenshot 2024-04-29 135524](https://github.com/mantu1234567/Backend_Traini8_Mantu-kumar/assets/114673693/9bf7e1a4-7e7d-4d4f-8642-0cb84c63c7d6)





Postman

You can also use Postman for testing the APIs. Use the provided endpoints and send requests with appropriate JSON data for creating training centers or retrieving training centers with optional filters.

## Dependencies

SpringBoot Starter Web

SpringBoot Starter Data JPA

MySQL Driver

Lombok

Hibernate Validator (for validations)

Swagger (for API documentation and testing)
