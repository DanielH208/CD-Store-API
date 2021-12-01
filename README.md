# CD-Store-API

## Why are we doing this?  

We are doing this to create cloud based database using a API to manage stock/inventory of a CD store. This is to make tasks like creating, reading, updating and deleting easier then managing the inventory using physical files. This means for example that the price of a CD can be found in a few clicks just by searching the ID or the artist for example. This beats having to search through physical files to find the correct information.
   
   
   
## How I expected the challenge to go 

I expected the challenge to go smoothly with some small hiccups as is the case with most coding projects. I expect that putting effort into time planning and manging tasks will aid a smoother development process with less unforeseen hiccups. I expect the app to be fully up and working to the criteria standard all within the allocated time frame. 



## What went well? / What didn't go as planned?  

Developing the CRUD functionality went to plan smoothly. This was due to a solid understanding of what was required for CRUD functionality. 

Using Postman for requests went well and was a great way to quickly test my program as I went along.

Building the Jar file went well which now means my whole program can now be run easily from the terminal with a single line of code. This eliminated having to run the program through eclipse which adds more steps and its own issues.

Unit testing didn’t go as planned as I wasn’t quite sure on how to unit test certain parts of the app. However, after some research and answered questions, I finished the unit testing to a high standard with high testing coverage 

Integration testing didn’t go as planned as there was a conflict, I had missed between the test SQL-data and the data I was expecting for my tests. This conflict however was easily fixable and now means my program has a high-test coverage percentage.

Time planning didn’t go as planned as I finished my project earlier than I originally planned for in my Jira board.



## Possible improvements for future revisions of the project

One possible improvement for the future would be adding more customer queries to speed searches for items. For example, a query to find CD’s under a certain price would be a good improvement for a future revision.

Second possible improvement for the future would be adding another table alongside the CD table for things such as memorabilia, art or other limited-edition pieces. This is something you would see in a traditional CD store and would therefore be a good improvement for a future revision.

Third possible improvement for the future would be adjusting the al;ocated time scale of the project so the project finishes more on time. This can be done easily by evaluating how accurate the previous revisions time scale was and adjusting the new revisions time scale accordingly.



## Postman screenshots

Create CD request 

![create-request](https://user-images.githubusercontent.com/80534190/144249663-047a58c3-e841-499e-824f-d3775af39bde.JPG)

Create CD output 

![create-output](https://user-images.githubusercontent.com/80534190/144249729-3a9ec785-182a-488d-a32d-7c90988c1ed6.JPG)

Get all (read) CD's request

![getAll-request](https://user-images.githubusercontent.com/80534190/144250102-c52c42bf-8879-48eb-a4e7-725b13653340.JPG)

Get all (read) CD's output 

![getAll-output](https://user-images.githubusercontent.com/80534190/144250148-75340a92-6866-4f7e-bf93-12abf376c0ee.JPG)

Update CD request

![update-request](https://user-images.githubusercontent.com/80534190/144250201-bc2127b8-a1de-4422-aeaf-7fc3f4aba780.JPG)

Update CD output

![update-output](https://user-images.githubusercontent.com/80534190/144250245-bfc745a0-83e1-47bf-97d5-c35dc35e193f.JPG)

Delete CD request 

![delete-request](https://user-images.githubusercontent.com/80534190/144249809-a252d3f0-7e16-4842-9cbb-7c077c3ee895.JPG)

Delete CD output 

![delete-output](https://user-images.githubusercontent.com/80534190/144249841-d3e48f2f-f2cc-47e2-a971-1069dfc4b2a0.JPG)

Delete CD result of output

![delete-result-of-output](https://user-images.githubusercontent.com/80534190/144249913-59ca47f9-1367-44e1-9309-7adbd731494a.JPG)

Get CD by ID request 

![getById-request](https://user-images.githubusercontent.com/80534190/144250375-f5607d4d-1a65-49ce-92e6-f95d0aeda09e.JPG)

Get CD by ID output

![getById-output](https://user-images.githubusercontent.com/80534190/144250413-de858187-2654-4f97-8a22-56234bacbb5d.JPG)

Get CD by Artist request 

![getByArtist-request](https://user-images.githubusercontent.com/80534190/144250502-d5ea9649-c415-4efb-97e5-ea47ff7d049f.JPG)

Get CD by Artist output 

![getByArtist-output](https://user-images.githubusercontent.com/80534190/144250579-8d80450a-5aa2-42dc-aeba-9fee59b80021.JPG)

Get CD by Artist and Release Year request 

![getByAristReleaseYear-request ](https://user-images.githubusercontent.com/80534190/144250745-0db4bfeb-2047-4506-86f4-f4ca0fc0a47c.JPG)

Get CD by Artist and Release Year output 

![getByArtistReleaseYear-output](https://user-images.githubusercontent.com/80534190/144252452-bbdb42d9-fa2f-46d5-a7e9-824e27e094ac.JPG)

All requests in postman 

![postman-all-request](https://user-images.githubusercontent.com/80534190/144251192-112c9dc5-ee48-446b-92f9-89a089a2de5f.JPG)



## Database Screenshot (shows persisting data) 

![h2-data](https://user-images.githubusercontent.com/80534190/144251084-8b8b80d3-ebba-490f-9f80-b9aef10b233a.JPG)



## Testing Screenshots 

Unit testing results

![unit-testing-results](https://user-images.githubusercontent.com/80534190/144251409-db849c78-a491-4cbf-b1a4-2fa465e9507c.JPG)

Unit testng coverage

![unit-testing-coverage](https://user-images.githubusercontent.com/80534190/144251453-cab4fbab-5dab-490b-9be3-a1c96e8f33c9.JPG)

Integration testing results 

![integration-testing-results](https://user-images.githubusercontent.com/80534190/144251554-e5534eac-7d0f-4c28-acea-3c3dc2c8b19b.JPG)

Integration testing coverage 

![Integration-testing-coverage](https://user-images.githubusercontent.com/80534190/144251602-5294c204-5d89-429d-a51c-ec80ed0c64cf.JPG)

Total program test coverage

![whole-project-coverage](https://user-images.githubusercontent.com/80534190/144251673-4580cbd2-0aa8-497d-af02-959e3bc1b840.JPG)



## Jira board 

https://testsite726.atlassian.net/jira/software/projects/CSP/boards/3/roadmap?selectedIssue=CSP-2

Story point 
1 point = 15 min

