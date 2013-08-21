medis
=====

medis first repo


For Tomcat in server.xml file find <Connector connectionTimeout="20000" port="8080" protocol="HTTP/1.1" redirectPort="8443"/> tag,
and add this attribute: useBodyEncodingForURI="true".