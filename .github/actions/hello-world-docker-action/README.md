# hello world docker action

This action prints "Hello" + the name input to log.

## Inputs

### `name`

**Required** The name of the person to greet. Default `""`.

## Outputs

### `time`

docker execute end time

## Example usage

uses: actions/hello-world-docker-action@v1
with:
  name: foofoo
