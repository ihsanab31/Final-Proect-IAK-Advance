package com.ihsan.android.stockhawk.data.generated.values;

import android.content.ContentValues;
import com.ihsan.android.stockhawk.data.QuoteColumns;
import java.lang.String;

public class QuotesValuesBuilder {
  ContentValues values = new ContentValues();

  public QuotesValuesBuilder Id(int value) {
    values.put(QuoteColumns._ID, value);
    return this;
  }

  public QuotesValuesBuilder Id(long value) {
    values.put(QuoteColumns._ID, value);
    return this;
  }

  public QuotesValuesBuilder symbol(String value) {
    values.put(QuoteColumns.SYMBOL, value);
    return this;
  }

  public QuotesValuesBuilder percentChange(String value) {
    values.put(QuoteColumns.PERCENT_CHANGE, value);
    return this;
  }

  public QuotesValuesBuilder change(String value) {
    values.put(QuoteColumns.CHANGE, value);
    return this;
  }

  public QuotesValuesBuilder bidprice(String value) {
    values.put(QuoteColumns.BIDPRICE, value);
    return this;
  }

  public QuotesValuesBuilder created(String value) {
    values.put(QuoteColumns.CREATED, value);
    return this;
  }

  public QuotesValuesBuilder isup(int value) {
    values.put(QuoteColumns.ISUP, value);
    return this;
  }

  public QuotesValuesBuilder isup(long value) {
    values.put(QuoteColumns.ISUP, value);
    return this;
  }

  public QuotesValuesBuilder iscurrent(int value) {
    values.put(QuoteColumns.ISCURRENT, value);
    return this;
  }

  public QuotesValuesBuilder iscurrent(long value) {
    values.put(QuoteColumns.ISCURRENT, value);
    return this;
  }

  public ContentValues values() {
    return values;
  }
}
