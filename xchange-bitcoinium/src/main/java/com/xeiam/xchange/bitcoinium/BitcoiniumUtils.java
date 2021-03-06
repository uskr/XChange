/**
 * Copyright (C) 2012 - 2013 Xeiam LLC http://xeiam.com
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.bitcoinium;

import java.util.Arrays;
import java.util.List;

import com.xeiam.xchange.currency.Currencies;
import com.xeiam.xchange.currency.CurrencyPair;

/**
 * A central place for shared Bitcoinium properties
 */
public final class BitcoiniumUtils {

  /**
   * private Constructor
   */
  private BitcoiniumUtils() {

  }

  public static final List<CurrencyPair> CURRENCY_PAIRS = Arrays.asList(

		  new CurrencyPair(Currencies.BTC, "mtgox_USD"),
		  
		  new CurrencyPair(Currencies.BTC, "mtgox_EUR"),
		  
		  new CurrencyPair(Currencies.BTC, "mtgox_GBP"),
		  
		  new CurrencyPair(Currencies.BTC, "mtgox_CAD"),
		  
		  new CurrencyPair(Currencies.BTC, "mtgox_JPY"),
		  
		  new CurrencyPair(Currencies.BTC, "mtgox_PLN")
		  
  );

  /**
   * Checks if a given CurrencyPair is covered by this exchange
   * 
   * @param currencyPair
   * @return
   */
  public static boolean isValidCurrencyPair(CurrencyPair currencyPair) {

    return CURRENCY_PAIRS.contains(currencyPair);
  }

}
