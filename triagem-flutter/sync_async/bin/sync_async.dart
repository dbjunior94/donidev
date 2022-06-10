void main() {
  print(stringToInt('d'));
}

int stringToInt(String text) {
  int value;

  try {
    value = int.parse(text);
  } catch (e) {
    throw Exception('O text passado ($text) não é um número');
  }

  return value;
}










// import 'dart:convert';
// import 'package:http/http.dart' as http;

// Future main() async {
//   final todo = await fetch();
//   print(todo.userId);
// }

// Future<Todo> fetch() async {
//   var url = Uri.parse('https://jsonplaceholder.typicode.com/todos/1');
//   var response = await http.get(url);
//   var json = jsonDecode(response.body);
//   var todo = Todo.fromJson(json);
//   return todo;
// }

// // {
// // 	"userId": 1,
// // 	"id": 1,
// // 	"title": "delectus aut autem",
// // 	"completed": false
// // }

// class Todo {
//   final String title;
//   final int id;
//   final int userId;
//   final bool completed;

//   Todo(
//       {required this.title,
//       required this.id,
//       required this.userId,
//       required this.completed});

//   factory Todo.fromJson(Map json) {
//     return Todo(
//       id: json['id'],
//       title: json['title'],
//       completed: json['completed'],
//       userId: json['userId'],
//     );
//   }

//   Map toJson() {
//     return {
//       'id': id,
//       'title': title,
//       'completed': completed,
//       'userId': userId,
//     };
//   }
// }

//Future<void> print4() async {
//  await Future.delayed(Duration(seconds: 2));
//  print('4');
//}

//var future = Future.delayed(Duration(seconds: 2));
  // future.then((value) => print('novo 4'));
  //print4();
  //print('1');
 // print('2');
  //print('3');
