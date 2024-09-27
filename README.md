
# Submission to the ConnectHack : Innovating Across Borders Hackathon.

This App has been developed over the course of 2 days to
solve the problem of the brief on improving interface and usability of Travel Apps.
Our team is called Syn tax, and we have focused on improving features that explore specific
country culture and safety. The Team consisted of five members with a mixed range of skills from
different degrees and levels. I Will be the main contributor to this implementation but
all the requirements and interface were created as a group effort in our PBR over a couple hours.

### Brief and Hackathon information 

https://github.com/user-attachments/assets/251d0614-250f-431a-8894-285bead4daae

## Design Documentation
The Interface for the app was developed in parallel to this app’s development due to the short timeframe of this project. This did add an extra element of difficulty to the project in combination with the groups colliding schedule and work commitments. But by making daily check in posts within a Teams chat the group was able to keep every member updated on the completion of assigned tasks and upload these documents to a shared channel. This way: Hex codes, Vector Icons, Logos and Information Content was in a communal space to create some consistency between the design and the implementation despite members working from home or having ongoing working copies.

### Initial Requirements Gathered
Here is a table of our inital requirements for the first draught of our App

| Must                                    | Should                          | Could                                      | Won't                      |
|-----------------------------------------|---------------------------------|--------------------------------------------|----------------------------|
| Select a country to travel to           | Home country specification      | Dictionary of common road signs/beach flags | All countries on one app   |
| Street accessibility                    | Emergency contact information   | Offline mode                               |  Profiles with user history |
| Focus on one Usecase                    | Common holidays                 |                                            |                            |
| National words/phrases/slang            | Important Safety information is highlighted |                                |                            |
| Common phrases/idioms in the local language |                             |                                            |                            |


### Market Research
Some of the Mental Models used based of the Market Research done with: **Google Maps, TripAdvisor, Booking.com and Airbnb**
- To and from destination navigation bar from **Google Maps Online.**
- **Airbnb** App Interface for sleek app navigation
- Content available on **Booking.com and TripAdvisor** and _**how that data is sourced (User Participation | Community funded)**_


### Final video of the Interactive Wireframe

https://github.com/user-attachments/assets/245a9ca6-ee1d-4a46-b615-7c9a7e006cf8


## Android App Development
### First Day End Product 
This is the Apps design and functionality after day one. The core layout of the app has been established
and I’ve started the implementation of some of the features.

https://github.com/user-attachments/assets/5f677bf6-3188-4d6a-a147-83c54518971d

#### Here you can see the following:
- The Recycle view has been populated with the data from a JSON file in the Main/Assets. This is where
we will store the behavioural information, but as a first draft to indicate a connection has been made 
I’ve populated the file with some dummy data.

- The Information Cards have been implemented into a scrolling carousal on the middle of the screen. They currently have
no behaviour. Tomorrow I will make the images image buttons which open a new view with the info-card information.

- The Country selection bar has been added, which allows users to enter text into each field. This will 
have behaviour added tomorrow to filter the information cards to a matching Country parameter.

- Buttons have been added to the static bottom bar of the app- they currently don't link to any additional
pages. For the purpose of this Hackathon being two days of coding I doubt I’ll get any further than this 
page for my implementation. But in the interest of finishing this project later those icons 
are buttons. They currently have no behaviour.

### Second Day End Product 
This is the Apps design and functionality after day two. The layout has been improved to use Image buttons now and display in a grid layout. 
The Logo changes as the Interface for the app was developed in parrell to this apps development.


https://github.com/user-attachments/assets/e63f0b50-8172-4401-8ddb-28ff5ff9e7e5

- The layout inside the Recycle View now uses GridLayoutManager to display a grid of the information cards
- Some of the irrelevant JSON data like Description was stripped back from this view. That will be used in an Information Cards expanded view in the next stage **Story**
- Additional variables were added to the Info Card data class. The string values Country and Category will be used in the next deliverable to filter the info Cards in the View based on the matching parameter in the search bar at the top of the page.

### End of Hackathon
On the final day of the hackathon the team made some final changes to the overall presentation and discussed flow to the pitch. The Presentation went okay but we could have definitely improved on our pacing as we had a lot of content to show in only five minutes, so ultimately, we ended up skipping over some features in the sake of time. After our pitch the audience asked a few questions which I’ll try to summarise here for you:

| **Question**                                                                 | **Answer**                                                                                                                                                                                                                                                                                                                                 |
|-----------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| "You used a static Json file as your data source, how would you improve on this?" | I intentionally used a Json format instead of statically uploading the data in the resource directory, so that later an ApiService Interface can be integrated easily. I'd simply use the Retrofit library's @GET annotation to make that HTTP request.                                                                                     |
| "If you were to put the app on the market today, how would the app make money?"   | This is an excellent question that got us all thinking. Since I honestly don't know how a purely informational app could make money, we discussed some similar sites to our app's model like Wikipedia and said that we would have to do further market research on how sites like that are able to source funding. |

![ce9615cc-a953-4a2f-ab8a-3d4f9f63629b](https://github.com/user-attachments/assets/f99ceda6-5ce8-4d82-8724-aaafff52980e)

