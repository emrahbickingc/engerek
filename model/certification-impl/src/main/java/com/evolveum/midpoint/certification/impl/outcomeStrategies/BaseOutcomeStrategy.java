/*
 * Copyright (c) 2010-2017 Evolveum
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

package com.evolveum.midpoint.certification.impl.outcomeStrategies;

import com.evolveum.midpoint.certification.impl.AccCertResponseComputationHelper;
import com.evolveum.midpoint.xml.ns._public.common.common_3.AccessCertificationCaseOutcomeStrategyType;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author mederly
 */
public abstract class BaseOutcomeStrategy implements OutcomeStrategy {

    @Autowired
    protected AccCertResponseComputationHelper computationHelper;

    protected void register(AccessCertificationCaseOutcomeStrategyType strategy) {
        computationHelper.registerOutcomeStrategy(strategy, this);
    }
}