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
 * 
 */
public interface IFileService {

	String getFilePath(Map<String, Object> searchParamaters);

}
