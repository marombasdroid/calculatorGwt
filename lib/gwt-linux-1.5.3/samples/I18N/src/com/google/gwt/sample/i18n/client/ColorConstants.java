/*
 * Copyright 2007 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.gwt.sample.i18n.client;

import com.google.gwt.i18n.client.ConstantsWithLookup;

/**
 * Internationalized constants used by
 * {@link ConstantsWithLookupExampleController}.
 */
public interface ColorConstants extends ConstantsWithLookup {

  @DefaultStringValue("Black")
  String black();

  @DefaultStringValue("Blue")
  String blue();

  @DefaultStringValue("Green")
  String green();

  @DefaultStringValue("Grey")
  String grey();

  @DefaultStringValue("Light Grey")
  String lightGrey();

  @DefaultStringValue("Red")
  String red();

  @DefaultStringValue("White")
  String white();

  @DefaultStringValue("Yellow")
  String yellow();
}
