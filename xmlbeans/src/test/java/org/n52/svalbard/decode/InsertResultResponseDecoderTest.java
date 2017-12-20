/*
 * Copyright 2016-2017 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.svalbard.decode;

import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.apache.xmlbeans.XmlObject;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.n52.shetland.ogc.sos.response.InsertResultResponse;
import org.n52.svalbard.decode.exception.DecodingException;
import org.n52.svalbard.decode.exception.UnsupportedDecoderInputException;

import net.opengis.sos.x20.InsertResultResponseDocument;

/**
 * @author <a href="mailto:e.h.juerrens@52north.org">J&uuml;rrens, Eike Hinderk</a>
 *
 */
public class InsertResultResponseDecoderTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrowExceptionOnWrongInputType() throws DecodingException {
        thrown.expect(UnsupportedDecoderInputException.class);
        thrown.expectMessage(
                "Decoder InsertResultResponseDecoder can not decode 'org.apache.xmlbeans.impl.values.XmlAnyTypeImpl'");

        new InsertResultResponseDecoder().decode(XmlObject.Factory.newInstance());
    }

    @Test
    public void shouldThrowExceptionOnNullInput() throws DecodingException {
        thrown.expect(UnsupportedDecoderInputException.class);
        thrown.expectMessage(
                "Decoder InsertResultResponseDecoder can not decode 'null'");

        new InsertResultResponseDecoder().decode(null);
    }

    @Test
    public void shouldThrowExceptionOnMissingTypeInDocument() throws DecodingException {
        thrown.expect(DecodingException.class);
        thrown.expectMessage("Received XML document is not valid. Set log level to debug to get more details");

        new InsertResultResponseDecoder().decode(InsertResultResponseDocument.Factory.newInstance());
    }

    @Test
    public void shouldCreateInsertResultResponse() throws DecodingException {
        InsertResultResponseDocument isrd = InsertResultResponseDocument.Factory.newInstance();
        isrd.addNewInsertResultResponse();
        InsertResultResponse decodedResponse = new InsertResultResponseDecoder().decode(isrd);

        assertThat(decodedResponse, is(notNullValue(InsertResultResponse.class)));
    }

}
