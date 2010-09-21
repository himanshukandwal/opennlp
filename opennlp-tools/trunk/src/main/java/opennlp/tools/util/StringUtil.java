/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreemnets.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package opennlp.tools.util;

public class StringUtil {
  
  /**
   * Determines if the specified character is a whitespace.
   * 
   * A character is considered a whitespace when one
   * of the following conditions is meet:
   * 
   * <ul>
   * <li>Its a {@link Character#isWhitespace(int)} whitespace.</li>
   * <li>Its a part of the Unicode Zs category ({@link Character#SPACE_SEPARATOR}).</li>
   * </ul>
   * 
   * <code>Character.isWhitespace(int)</code> does not include no-break spaces.
   * In OpenNLP no-break spaces are also considered as white spaces.
   * 
   * @param charCode
   * @return
   */
  public static boolean isWhitespace(char charCode) {
    return Character.isWhitespace(charCode)  || 
    Character.getType(charCode) == Character.SPACE_SEPARATOR;
  }
  
  /**
   * Determines if the specified character is a whitespace.
   * 
   * A character is considered a whitespace when one
   * of the following conditions is meet:
   * 
   * <ul>
   * <li>Its a {@link Character#isWhitespace(int)} whitespace.</li>
   * <li>Its a part of the Unicode Zs category ({@link Character#SPACE_SEPARATOR}).</li>
   * </ul>
   * 
   * <code>Character.isWhitespace(int)</code> does not include no-break spaces.
   * In OpenNLP no-break spaces are also considered as white spaces.
   * 
   * @param charCode
   * @return
   */
  public static boolean isWhitespace(int charCode) {
    return Character.isWhitespace(charCode)  || 
        Character.getType(charCode) == Character.SPACE_SEPARATOR;
  }
}