// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/one_extension.proto at 20:1
package com.squareup.wire.protos.one_extension;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.TagMap;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public final class OneExtension extends Message<OneExtension> {
  public static final ProtoAdapter<OneExtension> ADAPTER = ProtoAdapter.newMessageAdapter(OneExtension.class);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ID = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String id;

  public OneExtension(String id) {
    this(id, null);
  }

  public OneExtension(String id, TagMap tagMap) {
    super(tagMap);
    this.id = id;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OneExtension)) return false;
    OneExtension o = (OneExtension) other;
    return equals(tagMap(), o.tagMap())
        && equals(id, o.id);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = tagMap() != null ? tagMap().hashCode() : 0;
      result = result * 37 + (id != null ? id.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<OneExtension, Builder> {
    public String id;

    public Builder() {
    }

    public Builder(OneExtension message) {
      super(message);
      if (message == null) return;
      this.id = message.id;
    }

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    @Override
    public OneExtension build() {
      return new OneExtension(id, buildTagMap());
    }
  }
}
