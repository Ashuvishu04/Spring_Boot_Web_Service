It is Spring boot Project For Store key value Web Services

1) Intall Spring tool suite/ Intellij

Service contains 3 End Points
----get(long key)
To get the existing value associated with web store

----set(long key, String value)
To set some new entry in store with new key and value

----updateKey(long key, String value)
To update already existing key with new value

2) Install Apache Tomcat
For launching the appication

3) To Test - Either Post Man or Any (HttpClient, Apache http, Rest Assured)

End Points - localhost:8080/grofers/services/storeservice/get/{key}
	       - localhost:8080/grofers/services/storeservice/set
	            payload
	            <value> ABCD </value>
	       - localhost:8080/grofers/services/storeservice/update
	            payload
	            <key> 123 </key>
	            <value> ABCD </value>

4) To Run By Docker
# Build image from dockerfile
docker build -f Dockerfile -t docker-grofers-webservice .
docker images (To find your image)
docker run -p 8085:8085 docker-grofers-webservice