/*
 * Copyright 2015 52°North Initiative for Geospatial Open Source
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
package org.n52.iceland.service;

/**
 * TODO JavaDoc
 *
 * @author Christian Autermann <c.autermann@52north.org>
 *
 * @since 4.0.0
 */
public interface MiscSettings {
    String TOKEN_SEPARATOR = "misc.tokenSeparator";

    String TUPLE_SEPARATOR = "misc.tupleSeparator";

    String DECIMAL_SEPARATOR = "misc.decimalSeparator";

    String CHARACTER_ENCODING = "misc.characterEncoding";

    String SRS_NAME_PREFIX_SOS_V1 = "misc.srsNamePrefixSosV1";

    String SRS_NAME_PREFIX_SOS_V2 = "misc.srsNamePrefixSosV2";

    String DEFAULT_OFFERING_PREFIX = "misc.defaultOfferingPrefix";

    String DEFAULT_PROCEDURE_PREFIX = "misc.defaultProcedurePrefix";

    String DEFAULT_OBSERVABLEPROPERTY_PREFIX = "misc.defaultObservablePropertyPrefix";

    String DEFAULT_FEATURE_PREFIX = "misc.defaultFeaturePrefix";

    String HTTP_STATUS_CODE_USE_IN_KVP_POX_BINDING = "misc.httpResponseCodeUseInKvpAndPoxBinding";

    String RELATED_SAMPLING_FEATURE_ROLE_FOR_CHILD_FEATURES = "misc.relatedSamplingFeatureRoleForChildFeatures";

    String HYDRO_MAX_NUMBER_OF_RETURNED_VALUES = "profile.hydrology.maxReturnedValue";

    String HYDRO_MAX_NUMBER_OF_RETURNED_TIME_SERIES = "profile.hydrology.maxReturnedTimeSeries";

    String RETURN_OVERALL_EXTREMA_FOR_FIRST_LATEST = "profile.hydrology.overallExtrema";
}
