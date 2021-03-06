/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.acme.impl;

import com.acme.LoggingService;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class SystemOutLoggingService implements LoggingService {
  @Override
  public void logMessage(final String msg) {
    InputOutput.<String>println(msg);
  }
}
