// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/redacted_test.proto at 52:1
package com.squareup.wire.protos.redacted;

import com.google.protobuf.FieldOptions;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.TagMap;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public final class RedactedRequired extends Message<RedactedRequired> {
  public static final ProtoAdapter<RedactedRequired> ADAPTER = ProtoAdapter.newMessageAdapter(RedactedRequired.class);

  private static final long serialVersionUID = 0L;

  public static final FieldOptions FIELD_OPTIONS_A = new FieldOptions.Builder()
      .setExtension(Ext_redacted_test.redacted, true)
      .build();

  public static final String DEFAULT_A = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REQUIRED,
      redacted = true
  )
  public final String a;

  public RedactedRequired(String a) {
    this(a, null);
  }

  public RedactedRequired(String a, TagMap tagMap) {
    super(tagMap);
    this.a = a;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RedactedRequired)) return false;
    RedactedRequired o = (RedactedRequired) other;
    return equals(tagMap(), o.tagMap())
        && equals(a, o.a);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = tagMap() != null ? tagMap().hashCode() : 0;
      result = result * 37 + (a != null ? a.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<RedactedRequired, Builder> {
    public String a;

    public Builder() {
    }

    public Builder(RedactedRequired message) {
      super(message);
      if (message == null) return;
      this.a = message.a;
    }

    public Builder a(String a) {
      this.a = a;
      return this;
    }

    @Override
    public RedactedRequired build() {
      if (a == null) {
        throw missingRequiredFields(a, "a");
      }
      return new RedactedRequired(a, buildTagMap());
    }
  }
}
