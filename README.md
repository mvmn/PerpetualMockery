# PerpetualMockery
PerpetualMockery is an HTTP mock server similar to WireMock
Unlike WireMock though it has it's own DSL and an IDE-like editor for that DSL with code completion, validation and syntax highlighting.

Also unlike WireMock the mock server is separated from the admin server, it runs on a separate port and can be separately secured.

Admin server also allows for securing it with username and password, with cookie-based form auth (using Spring Security).
