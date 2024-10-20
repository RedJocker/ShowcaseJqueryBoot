This project contains two modules: 
diophoneexercise and showcase.

Both projects were developed with java 17 and might fail 
building with different java versions. To use command line
commands make sure to set your JAVA_HOME to a compatible java version.

The module showcase is a very simple fullstack application 
with springboot on backend and jquery on frontend.
The page displays a products carousel on an aside 
on the right and products descriptions on the left.
Changing product changes the description accordingly.
To run you can use the command `./gradlew bootRun`, 
this will start a webserver on port 8080, and you will
be able to visit http://localhost:8080/ on your 
favorite browser and see the page.
The carousel is done using glidejs library 
and populated with data from our backend.
Frontend project files can be seen at `main/resources/static`.
The backend is a very simple springboot application 
with an InMemoryDatabase. There is only one relevant rest endpoint
at `/product` that returns a list of products modeled with just with 
id, name, description and imageUrl.

![showcase](https://github.com/RedJocker/ShowcaseJqueryBoot/blob/main/assets/showcase.gif)


The module diophoneexercise is an exercise proposed by DIO 
on basics of object orientation.
To run you can use the command `./gradlew run`, it will launch
a console application with the exercise result.
A high level class diagram of diophoneexercise 
is provided on its internal README.md.

![diophoneexercise](https://github.com/RedJocker/ShowcaseJqueryBoot/blob/main/assets/diophoneexercise.gif)
