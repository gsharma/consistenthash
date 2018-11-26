package com.github.consistenthash.ring;

import java.util.function.Function;

/**
 * A skeleton key provider. Note that keys generated by this provider are expected to be immutable.
 * 
 * @author gaurav
 */
public interface KeyProvider extends Function<Void, String> {
  @Override
  default String apply(Void blah) {
    return key();
  }

  String key();

}