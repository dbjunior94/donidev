import 'package:conversor_moedas/app/models/currency_model.dart';
import 'package:flutter/material.dart';

class CurrencyBox extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Row(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Expanded(
          child: SizedBox(
            height: 56,
            child: DropdownButton<CurrencyModel>(
                isExpanded: true,
                underline: Container(
                  height: 1,
                  color: Colors.amber,
                ),
                items: [
                  DropdownMenuItem<CurrencyModel>(
                    child: Text('Real'),
                    value: CurrencyModel.getCurrencies()[0],
                  ),
                  DropdownMenuItem<CurrencyModel>(
                    child: Text('Dolar'),
                    value: CurrencyModel.getCurrencies()[1],
                  ),
                ],
                onChanged: (value) {}),
          ),
        ),
        SizedBox(
          width: 10,
        ),
        Expanded(
            flex: 2,
            child: TextField(
                decoration: InputDecoration(
                    enabledBorder: UnderlineInputBorder(
                      borderSide: BorderSide(color: Colors.amber),
                    ),
                    focusedBorder: UnderlineInputBorder(
                      borderSide: BorderSide(color: Colors.amber),
                    )))),
        SizedBox(
          height: 50,
        ),
        ElevatedButton(
          style: ElevatedButton.styleFrom(primary: Colors.amber),
          onPressed: () {},
          child: Text('CONVERTER'),
        )
      ],
    );
  }
}
