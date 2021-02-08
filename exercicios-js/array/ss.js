SELECT ");
query.append("   DISTINCT(B.billing_id), ");
query.append("   B.cycle_instance_id, ");
query.append("   CI.start_date, ");
query.append("   CI.end_date, ");
query.append("   CI.status, ");
query.append("   CI.cycle_type, ");
query.append("   B.total_value, ");
query.append("   B.total_payment, ");
query.append("   B.total_commission, ");
query.append("   B.total_adjustment, ");
query.append("   B.total_orders, ");
query.append("   B.sale_value, ");
query.append("   B.sale_commission, ");
query.append("   B.return_value, ");
query.append("   B.return_commission, ");
query.append("   B.average_commission ");
query.append(" FROM ");
query.append("   T_BILLING B ");
query.append("   INNER JOIN T_BILLING_COMMISSION_ITEM BCI ON B.billing_id = BCI.billing_id ");
query.append("   INNER JOIN T_COMMISSION_ITEM CITEM ON CITEM.commission_item_id = BCI.commission_item_id ");
query.append("   INNER JOIN T_COMMISSION_TRANSACTION CT ON CT.commission_transaction_id = CITEM.commission_transaction_id ");
query.append("   INNER JOIN T_CYCLE_INSTANCE CI ON CI.cycle_instance_id = B.cycle_instance_id ");
query.append(" WHERE ");
query.append("   CT.CONSIGNMENT_ID = :consignment_id");
query.append("   AND CI.cycle_type = 'PAYMENT' ");
query.append("   AND CI.status = 'OPEN' ");
