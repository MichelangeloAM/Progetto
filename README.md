# Progetto
Progetto Programmazione ad Oggetti

Inizio progetto: 14/05/2019

Consegna prevista: 22/06/2019

Spiegazione Commit dal 1° al 41°:

Nei primi 41 commit abbiamo lavorato alla Spring Boot Application per il download del file Excel dal CSV.

Nei vari commit è possibile osservare varie prove con l'intento di capire il funzionamento di GitHub ed un corretto setup da parte nostra.

D'ora in poi (dal 42° commit) i commit saranno meno, ordinati in versioni (esempio: 1.0, 1.1, 1.2, 2.0), partendo dalla 1.0.

COME UTILIZZARE IL PROGRAMMA:
1- Attraverso eclipse, aprire la sezione Project_Farmacia> src> main> java> com> example:
   qui saranno presenti le classi Controller e ProjectFarmaciaApplication, la classe contenente il main che servirà all'utente per          avviare l'applicazione.
  
2- Doppio click su Classe ProjectFarmaciaApplication. Questa classe contiene il main e sarà possibile, attraverso il comando Run As>        spring boot app, avviare l'applicazione.

3- All'avvio dell'applicazione, il sistema scaricherà automaticamente, sul computer dell'utente, un file csv. Sul file csv sono presenti    tutte le farmacie (e vari dati) presenti nella regione del Lazio, a cui l'utente può accedere sia direttamente, mediante il file        scaricato, sia attraverso l'applicazione, mediante semplici passaggi. 

4- L'applicazione è una spring boot application, contiene quindi varie funzioni di spring utilizzabili dall'applicazione in seguito        all'importazione di specifiche librerie. E' possibile vedere dalla Classe Controller com'è stato strutturato il controllo del            programma da parte dell'utente.

5- Nel controller sono implementate le seguenti funzioni:
   _ /metadati => permette di visualizzare attributi e tipi presenti nel file csv.
   
   _ /dati => permette di visualizzare i dati presenti nel file csv.
   
   _ /statistics => permette di filtrare i dati, attraverso specifici filtri, e visualizzare i risultati dell'operazione.
   
   Queste funzioni si possono utilizzare all'interno dell'applicazione.
   
NOTA IMPORTANTISSIMA: l'utente potrebbe ricevere diversi errori che potrebbero impedirgli l'avvio dell'apllicazione. L'utente allora                           deve, in questo caso, aggiungere le seguenti librerie esterne:
                      _ commons-io-2.6
                      _ commons-lang3-3.9
                      _ java-json
                      _ json-simple-1.1.1
                      _ jsoup-1.12.1
                      _ junit-jupiter-params-5.4.0
                      
          l'utente deve quindi: procurarsi le librerie descritte sopra (facilmente reperibili da internet), fare Click                             destro sulla cartella del progetto, selezionare Bild Path> Configure Bild Path, cliccare su Java Build Path e,                           nella sezione "Libraries", selezionare Add External JARs. A questo punto basterà trovare le librerie appena                             scaricate, cliccare su "Apri" e in seguito su "Apply and Close";    

