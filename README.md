Dans ce projet, on propose de mettre en place un serveur d’annuaire téléphonique des
étudiants de l’UFR SET.
Le serveur communique avec seul client a travers les sockets. Un étudiant est identifie par des
propriétés non modifiables telles que son nom. Prénom, téléphone, mail url et sa date
naissance.
Les données stockées sur le serveur sont persistantes : les propriétés des étudiants gérés par
l’annuaire seront perdues lorsque le serveur est arrêté.
Le serveur d’annuaire permet de fournir plusieurs services :
    • Insérer les propriétés d’un nouvel étudiant’ Utilise les exceptions pour gérer une 
      insertion redondante d’un étudiant dans le nom et le prénom existant déjà sur l’annuaire.
    • Retrouver les propriétés d’un étudiant recherché à travers son nom et son prénom.
      Utilise les exceptions pour le cas d’un étudiant introuvable.
    • Lister l’ensemble des étudiants gérés par l’annuaire.
    • Lister l’ensemble des service rendus par le serveur
1. Développer la partie serveur qui accepte une seule connexion client a la
fois. Le serveur de fournir les services ci-dessus.
2. Développer la partie client qui communique avec le serveur a travers un
socket. La partie cliente permet d’afficher un menu qui permet de lister
les services du serveur. Ce menu doit faciliter l’utilisation de
l’application.
