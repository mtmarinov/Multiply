mvn package

docker build -t multiply .
docker run -p 80:8080 multiply

curl "http://localhost/multiply?operand1=51234567890&operand2=40987654321"
