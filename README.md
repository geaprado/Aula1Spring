git config --global http.sslVerify false

# Aula1Spring

POST:
 http://localhost:8080/books/
 
 {
	
	"titulo" : "Senhor dos Anéis 2000",
	"quantidadeDePaginas" : 500,
	"isbn" : "090289090219890",
	"dataLancamento" : "1980-01-22T21:48:24.91-03:00"
	
}

PUT:

http://localhost:8080/books/1

{
	
	"titulo" : "Senhor dos Anéis 500",
	"quantidadeDePaginas" : 500,
	"isbn" : "090289090219890",
	"dataLancamento" : "1980-01-22T21:48:24.91-03:00"
	
}

Patch:
http://localhost:8080/books/1

{
	
	"nome" : "Bruno Gea",
	"id" : 100 
	
}

DELETE:

http://localhost:8080/books/2

GET:
http://localhost:8080/books/

