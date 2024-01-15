Documentatie Project DriveDealz

Methode:
•	onCreateView: Wordt aangeroepen bij het maken van het fragment. Hier worden de tekstvakken ingevuld met ontvangen gegevens.
CarListAdapter.java
Deze adapter koppelt autogegevens aan de lijstweergave in CarListFragment.

•	Variabelen:
•	carList: Lijst van auto's.
•	context: App-context.
•	Methode:
•	onCreateViewHolder: Maakt een nieuwe weergave voor een auto-item.
•	onBindViewHolder: Vult de weergave-elementen in het auto-item met gegevens uit de dataset.
•	getItemCount: Geeft het totale aantal auto's in de lijst terug.
•	setCarList: Vervangt de huidige lijst met auto's en werkt de weergave bij.
•	Innerlijke klasse (CarItemViewHolder):
•	Houdt de weergave-elementen van een auto-item bij, zoals TextViews en een Button.
MainActivity.java
De hoofdactiviteit bevat een balk en navigatie.

•	Methode:
•	navigateToCarList: Wordt aangeroepen bij klikken op "Car List". Gaat naar CarListFragment.
activity_main.xml
Layout voor hoofdactiviteit met balk en fragmentplek.
fragment_home.xml
Een fragment met een welkomsttekst die gebruikers aanspoort op "Car List" te klikken.
fragment_car_details.xml
Layout voor het tonen van details van een auto.
fragment_car_list.xml
Layout voor het tonen van een lijst met auto's.
car_item.xml
Layout voor een individueel item in de lijst.

Gebruikte Githubs :

David-VS
https://github.com/David-VS/DataBass/tree/main

Youtube links : 

https://www.youtube.com/watch?v=0hIDrGfLf40&t=3388s

https://www.youtube.com/watch?v=5owY0N5K0qk&t=4s

https://www.youtube.com/watch?v=hJPk50p7xwA&list=RDCMUCYLAirIEMMXtWOECuZAtjqQ&start_radio=1&rv=hJPk50p7xwA&t=812&ab_channel=Stevdza-San


Link naar ChatGpt Discussie:

https://chat.openai.com/share/a6025f7a-9111-47d6-b651-d5a920b0343c.
