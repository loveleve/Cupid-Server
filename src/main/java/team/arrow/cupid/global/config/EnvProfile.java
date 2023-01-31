package team.arrow.cupid.global.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Getter
@RequiredArgsConstructor
public enum EnvProfile {
    LOCAL("local", 1),
    DEVELOPMENT("dev", 2),
    PRODUCTION("prd", 3);

    private final String value;
    private final int order;

    public static boolean hasProfile(String[] values) {
        if (ObjectUtils.isEmpty(values)) {
            return false;
        }

        return hasProfile(Arrays.asList(values));
    }

    public static boolean hasProfile(List<String> values) {
        if (CollectionUtils.isEmpty(values)) {
            return false;
        }

        return Arrays.stream(EnvProfile.values())
                .anyMatch(o -> values.contains(o.getValue()));
    }

    public static EnvProfile findByValue(String value) {
        if (!StringUtils.hasText(value)) {
            return null;
        }

        return Arrays.stream(EnvProfile.values())
                .filter(o -> o.getValue().equalsIgnoreCase(value))
                .findFirst()
                .orElse(null);
    }

    public static EnvProfile findByValues(String[] values) {
        if (ObjectUtils.isEmpty(values)) {
            return null;
        }

        return findByValues(Arrays.asList(values));
    }

    public static EnvProfile findByValues(List<String> values) {
        if (CollectionUtils.isEmpty(values)) {
            return null;
        }

        return Arrays.stream(EnvProfile.values())
                .filter(o -> values.contains(o.getValue()))
                .min(Comparator.comparingInt(EnvProfile::getOrder))
                .orElse(null);
    }
}