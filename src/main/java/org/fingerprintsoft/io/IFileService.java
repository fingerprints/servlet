/*
 * org/fingerprintsoft/io/IFileService.java
 *
 * Copyright (C) 2010 Fingerprints Software
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with this library.
 * If not, see <http://www.gnu.org/licenses/>.
 */
package org.fingerprintsoft.io;

import java.util.Map;

/**
 * Interface for providing a simple <code>getFilePath(Map)</code> method to
 * retrieve the file path from a set of search parameter or any other format
 * which requires a look up from an additional service or just to abstract the
 * I/O code from <code>FileServlet</code>.
 * 
 * 
 * @author Fuzail Sarang <fuzail@fingerprintsoft.org>
 * @link http://git://github.com/fingerprints/fileservlet.git
 * 
 */
public interface IFileService {

    String getFilePath(Map<String, Object> searchParamaters);

}
