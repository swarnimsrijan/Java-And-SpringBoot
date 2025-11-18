# Java Database Connectivity
- RDBMS <-> Sql query <-> Java

# Types of JDBC Drivers

| Type | Name                          | Description                                                                                     | Use Case / Example Databases                |
|------|-------------------------------|-------------------------------------------------------------------------------------------------|---------------------------------------------|
| 1    | JDBC-ODBC Bridge Driver       | Uses ODBC driver to connect to the database. Not recommended for production.                  | Legacy systems, Microsoft Access            |
| 2    | Native-API Driver             | Uses native database APIs (partly Java, partly native code).                                  | Oracle OCI, Informix                         |
| 3    | Network Protocol Driver       | Uses middleware to translate JDBC calls into database-specific network protocol.              | MySQL, PostgreSQL, Microsoft SQL Server     |
| 4    | Thin Driver (Pure Java Driver)| Directly converts JDBC calls into database-specific protocol. Fully written in Java.         | MySQL Connector/J, Oracle Thin, PostgreSQL  |

# Steps
- Import the package(java.sql)
- Load and Register the driver(from jar files) : forName method is used for registering
- Establish the Connection
- Create the statement(statement, preparedStatement, CallableStatement(PLSQL))
- Execute the query
- Process Result
- Close