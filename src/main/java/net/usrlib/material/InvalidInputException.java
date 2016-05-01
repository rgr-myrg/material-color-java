/*
 * Copyright 2016. UsrLib.Net
 *
 * Licensed under the Apache License,  Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *@author https://github.com/rgr-myrg
 */
package net.usrlib.material;

public class InvalidInputException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidInputException(String message) {
		super(message);
	}

	public static final InvalidInputException errorMissingOptionValue(String propertyName) {
		return new InvalidInputException("Error: missing value for '" + propertyName + "' option");
	}

	public static final InvalidInputException errorMissingProperty(String propertyName) {
		return new InvalidInputException("Error: JSON missing '" + propertyName + "' keyname");
	}

	public static final InvalidInputException errorInvalidFilename(String propertyName) {
		return new InvalidInputException("Error: Please provide a valid filename for option " + propertyName);
	}
}
