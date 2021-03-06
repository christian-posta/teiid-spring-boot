/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.teiid.spring.annotations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(TYPE)
@Retention(RUNTIME)
public @interface ExcelTable {
    
	/**
	 * On Class ONLY, defines the excel file to be read. Either relative to source's
	 * parent directory or absolute path
	 */
    String file();
    
    /**
     * Row number from which data rows start from
     */
    int dataRowStartsAt() default 0;
    
    /**
	 * When true any cells with empty value for header row are ignored, otherwise an
	 * empty header row cell indicates end of columns.
	 */
    boolean ignoreEmptyCells() default false;
    
    /**
     * Row number that contains the header information, -1 no header
     */
    int headerRow() default -1;
    
    /**
     * Name of the Sheet to read the data from
     */
    String sheetName() default "Sheet1";
}
