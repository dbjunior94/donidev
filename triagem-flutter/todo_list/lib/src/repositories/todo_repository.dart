import 'package:dio/dio.dart';

class TodoRepository {
  final dio = Dio();
  final url = 'https://jsonplaceholder.typicode.com/todos';

  Future fetchTodos() async {
    final response = await dio.get(url);
    response.data;
  }
}
