import 'package:flutter/material.dart';
import 'package:ola_mundo/app_controller.dart';

class HomePage extends StatefulWidget {
  @override
  State<HomePage> createState() {
    return HomePageState();
  }
}

class HomePageState extends State<HomePage> {
  int counter = 0;
  bool isDartTheme = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      drawer: Drawer(
          child: Column(
        children: [
          UserAccountsDrawerHeader(
            currentAccountPicture: ClipRRect(
              borderRadius: BorderRadius.circular(40),
              child: Image.network(
                  'https://scontent.fcpq3-1.fna.fbcdn.net/v/t39.30808-6/280058774_1166469067470729_5464952551814090103_n.jpg?_nc_cat=106&ccb=1-6&_nc_sid=09cbfe&_nc_eui2=AeFITHJmSAopnmOD0kfEHhlaUkvXpVgNhDNSS9elWA2EM-8ufntTpj2oLhmKGsqeVMYFyyrQ67DNfhkxnlJ4t4bH&_nc_ohc=GVDXO8fbzCIAX-nfJPl&_nc_ht=scontent.fcpq3-1.fna&oh=00_AT9HAfXHR7Tl4fIZ9dRaUJwPAAm4pfsQlFio34YM1AS6iQ&oe=62881702'),
            ),
            accountName: Text('Jacob Moura'),
            accountEmail: Text('jacob@flutterando.com.br'),
          ),
          ListTile(
            leading: Icon(Icons.home),
            title: Text('Inicio'),
            subtitle: Text('tela de inicio'),
            onTap: () {
              print('home');
            },
          ),
          ListTile(
            leading: Icon(Icons.home),
            title: Text('Logout'),
            subtitle: Text('Finalizar sessão'),
            onTap: () {
              Navigator.of(context).pushReplacementNamed('/');
            },
          )
        ],
      )),
      appBar: AppBar(
        title: Text('Home Page'),
        actions: [
          CustomSwitch(),
        ],
      ),
      body: Container(
        width: double.infinity,
        height: double.infinity,
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          //crossAxisAlignment: CrossAxisAlignment.stretch, estica
          //crossAxisAlignment: CrossAxisAlignment.start, no começo
          //crossAxisAlignment: CrossAxisAlignment.end, no final
          children: [
            Text('Contador: $counter'),
            Container(
              height: 10,
            ),
            CustomSwitch(),
            Container(
              height: 50,
            ),
            Row(
                mainAxisAlignment: MainAxisAlignment.spaceAround,
                crossAxisAlignment: CrossAxisAlignment.center,
                children: [
                  Container(
                    width: 50,
                    height: 50,
                    color: Colors.black,
                  ),
                  Container(
                    width: 50,
                    height: 50,
                    color: Colors.black,
                  ),
                  Container(
                    width: 50,
                    height: 50,
                    color: Colors.black,
                  ),
                ]),
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
        child: Icon(Icons.add),
        onPressed: () {
          setState(() {
            counter++;
          });
        },
      ),
    );
  }
}

class CustomSwitch extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Switch(
        value: AppController.instance.isDartTheme,
        onChanged: (value) {
          AppController.instance.changeTheme();
        });
  }
}
