RE: DRAFT - A Design Compass: East Oriented …
=============================================

This code is from this article :
http://jamesladdcode.com/?p=12

I found very interesting the author ideas, but I feel that's something wrong about, from the SOLID point of view. 

"Go to the east" is simple way to introduce IOC principle into code, but the pitfall is that all the business logic is concentrated to the last level to the east, so thats breaks the OCP & SRP principle.

This repository is a kind of refactoring and an attempt to use the "Go to the east" principle and make the east layer of code  Scallable.
