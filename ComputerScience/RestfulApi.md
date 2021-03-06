### RESTful API design

https://medium.com/hashmapinc/rest-good-practices-for-api-design-881439796dc9

> REST APIs are the face of any service, and therefore they should:

>1. Be easy to understand so that integration is straightforward
>2. Be well documented, so that semantic behaviors are understood (not just syntactic)
>3. Follow accepted standards such as HTTP

Conversions:
 * Use Nouns in URI
 * Plurals or Singulars(no hard rule)
 * Let the HTTP Verb Define Action
 * Don’t Misuse Safe Methods(GET,HEAD, OPTIONS and TRACE)
 * Depict Resource Hierarchy Through URI(GET /users/123/posts/1)
 * Version Your APIs(1. header: `Accept: application/vnd.hashmapinc.v2+json` 2.url: `/v2/users`)
 * Return Representation(choose the right return code)
 * Filter, Search and Sort(use parameters: `GET /users/123/posts?state=published&ta=scala` )
 *  Hypermedia As Transfer Engine Of Application State
 * Stateless Authentication & Authorization(REST APIs should be stateless)
 * HTTP Status Codes(it should define what the respective success or failure means from a server perspective.)