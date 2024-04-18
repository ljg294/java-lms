package nextstep.courses.domain;

public class SessionImage {

    private Long id;

    private ImageSpec imageSpec;

    private BaseEntity baseEntity;

    public SessionImage(ImageSpec imageSpec,
                        Long creatorId) {
        this(null, imageSpec, new BaseEntity(creatorId));
    }

    public SessionImage(Long id,
                        ImageSpec imageSpec,
                        BaseEntity baseEntity) {
        this.id = id;
        this.imageSpec = imageSpec;
        this.baseEntity = baseEntity;
    }
}
