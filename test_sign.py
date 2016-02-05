import pysodium

pk=None
sk=None

with open("keys/sign_public.key", "rb") as in_file:
    pk = in_file.read()
with open("keys/sign_private.key", "rb") as in_file:
    sk = in_file.read()

signed = pysodium.crypto_sign(b'test', sk)
ret=pysodium.crypto_sign_open(signed, pk)
print(ret)
