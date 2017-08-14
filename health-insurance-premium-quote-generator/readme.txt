This is a spring boot project:

mv clean and install will set this project up

Just need to run this project as java application:

i have implemented restful webservices:

below are the json to test this:


{ 
   "name":"irfan",
   "gender":"Male",
   "age":"27",
   "hyperTension":"true",
   "bloodpressure":"true",
   "sugar":"true",
   "overweight":"true",
   "smoking":"true",
   "alochol":"true",
   "exercise":"true",
   "drugs":"true"
}

i have developed two api for this:

generateQuote and getPersonDetails



to call generateQuote api url is: http://localhost:8080 with POST request

for getPersonDetails api same url with GET request