package org.psympla.semantics;

import org.psympla.symbol.Cell;

/**
 * A denotation specifies the relationship between a signifier and the
 * information it represents.
 * 
 * @author Elias N Vasylenko
 *
 * @param <T>
 */
public interface Denotation<T> {
  Sign<T> sign();

  T decode(Decomposition production, Cell parameters);

  Cell encode(Composition production, T information);
}